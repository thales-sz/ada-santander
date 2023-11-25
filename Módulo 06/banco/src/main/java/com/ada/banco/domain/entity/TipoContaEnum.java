package com.ada.banco.domain.entity;

public enum TipoContaEnum {
  CC("Conta Corrente"), CP("Conta Poupança");

  private String tipo;

  private TipoContaEnum(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }
}
