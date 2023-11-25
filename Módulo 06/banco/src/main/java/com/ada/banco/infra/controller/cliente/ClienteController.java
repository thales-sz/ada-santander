package com.ada.banco.infra.controller.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ada.banco.application.usecase.cliente.CriarNovoCliente;
import com.ada.banco.application.usecase.conta.CriarNovaConta;
import com.ada.banco.domain.dto.CriarClienteDto;
import com.ada.banco.domain.entity.Cliente;
import com.ada.banco.domain.entity.Conta;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {

  @Autowired
  private CriarNovoCliente criarNovoCliente;
  @Autowired
  private CriarNovaConta criarNovaConta;
  
  @PostMapping
  public ResponseEntity<?> criarCliente(@RequestBody @Validated CriarClienteDto criarClienteDto) {
    Cliente novoCliente;
    try {
      novoCliente = criarNovoCliente.execute(criarClienteDto);
      Conta novaConta = criarNovaConta.execute(novoCliente, criarClienteDto.tipoConta());
      novoCliente.setConta(novaConta);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
    return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
  }
}
