package com.ada.banco.application.usecase.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.banco.application.usecase.conta.CriarNovaConta;
import com.ada.banco.domain.dto.CriarClienteDto;
import com.ada.banco.domain.entity.Cliente;
import com.ada.banco.domain.entity.Conta;
import com.ada.banco.infra.database.repository.ClienteRepository;

@Service
public class CriarNovoCliente {
  @Autowired
  private ClienteRepository clienteRepository;

    public Cliente execute(CriarClienteDto clienteDto) throws Exception {
        Cliente clienteExistente = clienteRepository.findByCpf(clienteDto.cpf());

        Cliente cliente = new Cliente(clienteDto.nome(), clienteDto.cpf());

        if (clienteExistente != null) {
            throw new Exception("Já existe um Cliente com esse CPF");
        }

        return clienteRepository.save(cliente);
    }
}
