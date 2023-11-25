package com.ada.banco.infra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.banco.application.usecase.CriarNovoCliente;
import com.ada.banco.domain.entity.Cliente;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {

  @Autowired
  private CriarNovoCliente criarNovoCliente;
  
  @PostMapping
  public ResponseEntity<?> criarCliente(@RequestBody Cliente cliente) {
    System.out.println("Criando cliente");
    Cliente novoCliente;
    try {
      novoCliente = criarNovoCliente.execute(cliente);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }

    return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
  }
}
