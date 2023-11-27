package com.ada.banco.domain.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "clientes")
@Entity(name = "clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @Column(unique = false, name = "nome")
  private String nome;

  @Column(unique = true)
  private String cpf;

  @JsonManagedReference
  @OneToOne(cascade = CascadeType.ALL, mappedBy = "cliente", fetch = FetchType.EAGER)
  private Conta conta;

  public Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }


  public Cliente(String nome, String cpf, Conta conta) {
    this.nome = nome;
    this.cpf = cpf;
    this.conta = conta;
  }

  public Conta getConta() {
    return conta;
  }

  public void setConta(Conta conta) {
    this.conta = conta;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
