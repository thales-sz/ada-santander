package com.ada.banco.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Table(name = "contas")
@Entity(name = "contas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoContaEnum tipoConta;

    @Column(name = "agencia", nullable = false)
    private Long agencia;

    @Column(name = "digito", nullable = false)
    private Long digito;

    @Column(name = "saldo", nullable = false)
    private BigDecimal saldo;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaOrigem", fetch = FetchType.EAGER)
    private List<Transacao> transacao;

    public Conta(Long agencia, Long digito, BigDecimal saldo, TipoContaEnum tipo) {
        this.agencia = agencia;
        this.digito = digito;
        this.saldo = saldo;
        this.tipoConta = tipo;
    }

    public String getId() {
        return id;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao.add(transacao);
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getAgencia() {
        return agencia;
    }

    public void setAgencia(Long agencia) {
        this.agencia = agencia;
    }

    public Long getDigito() {
        return digito;
    }

    public void setDigito(Long digito) {
        this.digito = digito;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public static Conta gerarContaAleatoria(TipoContaEnum tipo) {
        Random random = new Random();
        Long agenciaNumero = 1000 + random.nextLong(9000);
        Long contaNumero = 10 + random.nextLong(90);

        return new Conta(agenciaNumero, contaNumero, BigDecimal.ZERO, tipo);
    }
}