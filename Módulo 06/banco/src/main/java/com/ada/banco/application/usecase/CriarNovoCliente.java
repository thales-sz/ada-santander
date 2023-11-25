package com.ada.banco.application.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ada.banco.domain.entity.Cliente;
import com.ada.banco.infra.database.repository.ClienteRepository;

@Component
public class CriarNovoCliente {
  @Autowired
  private ClienteRepository clienteRepository;

    public Cliente execute(Cliente cliente) throws Exception {
        Cliente ClienteExistente = clienteRepository.findByCpf(cliente.getCpf());
        if (ClienteExistente != null) {
            throw new Exception("Já existe um Cliente com esse CPF");
        }

        return clienteRepository.save(cliente);
    }
}
