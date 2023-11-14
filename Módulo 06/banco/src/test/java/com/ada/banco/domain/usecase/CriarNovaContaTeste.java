package com.ada.banco.domain.usecase;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ada.banco.domain.gateway.ContaGateway;
import com.ada.banco.domain.model.Conta;
import com.ada.banco.dummy.ContaGatewayDummyImp;

public class CriarNovaContaTeste {

  @Test
  public void deveLancarUmaExcessaoCaspJaExistaConta() {
    ContaGateway contaGateway = new ContaGatewayDummyImp();
    CriarNovaConta criarNovaConta = new CriarNovaConta(contaGateway);

    Conta conta = new Conta(123456L, 0002L, 5L, BigDecimal.ZERO, "Thales", "123456789");

    Assertions.assertThrows(Exception.class, () -> {
      criarNovaConta.execute(conta);
    });
  }

  @Test
  public void deveCriarUmaNovaConta() throws Exception {
    ContaGateway contaGateway = new ContaGatewayDummyImp();
    CriarNovaConta criarNovaConta = new CriarNovaConta(contaGateway);

    Conta conta = new Conta(123456L, 0002L, 5L, BigDecimal.ZERO, "Thales", "987654321");

    Conta novaConta = criarNovaConta.execute(conta);

    Assertions.assertEquals(novaConta.getTitular(), conta.getTitular());
  }
}
