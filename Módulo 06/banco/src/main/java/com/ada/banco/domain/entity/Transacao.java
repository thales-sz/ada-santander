package com.ada.banco.domain.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transacao {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @ManyToOne
  @JoinColumn(name = "conta_origem_id")
  private Conta contaOrigem;

  @ManyToOne
  @JoinColumn(name = "conta_destino_id")
  private Conta contaDestino;

  @Column(name = "valor", nullable = false)
  private BigDecimal valor;
}
