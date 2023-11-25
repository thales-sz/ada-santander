package com.ada.banco.domain.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "transacoes")
@Entity(name = "transacoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transacao {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @Enumerated(EnumType.STRING)
  private TipoTransacaoEnum tipoTransacao;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "conta_origem_id")
  private Conta contaOrigem;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "conta_destino_id")
  private Conta contaDestino;

  @Column(name = "valor", nullable = false)
  private BigDecimal valor;

  public Transacao(Conta contaOrigem, Conta contaDestino, BigDecimal valor, TipoTransacaoEnum tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
    this.contaDestino = contaDestino;
    this.contaOrigem = contaOrigem;
    this.valor = valor;
  }

  public Transacao(Conta contaOrigem, BigDecimal valor, TipoTransacaoEnum tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
    this.contaOrigem = contaOrigem;
    this.valor = valor;
  }
}
