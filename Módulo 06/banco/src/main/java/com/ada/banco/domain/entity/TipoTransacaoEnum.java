package com.ada.banco.domain.entity;

public enum TipoTransacaoEnum {
  SAQUE("Saque"), DEPOSITO("Depósito"), TRANSFERENCIA("Transferência");

  private String tipo;

  private TipoTransacaoEnum(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }
}
