package com.ada.banco.dummy;

import com.ada.banco.domain.model.Conta;

import java.math.BigDecimal;

public class ContaGatewayDummyImp {
    public Conta buscarPorCpf (String cpf) {
        if (cpf == "123456789") {
            return new Conta(123456L, 0002L, 5L, BigDecimal.ZERO, "Thales", "123456789");
        } else {
            return null;
        }
    };

    public Conta salvar(Conta conta) {
        return new Conta(123456L, 0002L, 5L, BigDecimal.ZERO, "Thales", "123456789");
    };
}
