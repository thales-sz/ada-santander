package com.ada.banco.application.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ada.banco.domain.entity.Cliente;
import com.ada.banco.domain.entity.Conta;
import com.ada.banco.infra.database.repository.ContaRepository;

@Component
public class CriarNovaConta {
    @Autowired
    private ContaRepository contaRepository;

    public Conta execute(Cliente clinte) throws Exception {
        Conta novaConta = new Conta();
        novaConta.setCliente(clinte);

        return contaRepository.save(novaConta);
    }
}
