package com.ada.banco.infra.controller.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.banco.application.usecase.conta.Depositar;
import com.ada.banco.application.usecase.conta.EncontreUmaConta;
import com.ada.banco.application.usecase.conta.Sacar;
import com.ada.banco.application.usecase.transacao.TransferenciaEntreContas;
import com.ada.banco.domain.dto.DepositoDto;
import com.ada.banco.domain.dto.TransferenciaDto;
import com.ada.banco.domain.entity.Conta;
import com.ada.banco.domain.entity.Transacao;

@RestController
@RequestMapping("/api/v1/conta")
public class ContaController {
  @Autowired
  private TransferenciaEntreContas transferenciaEntreContas;
  @Autowired 
  private EncontreUmaConta encontreUmaConta;
  @Autowired
  private Depositar depositar;
  @Autowired
  private Sacar sacar;

  @PostMapping("/transferir")
  public ResponseEntity<?> transferirEntreContas(@RequestBody @Validated TransferenciaDto transacao) {
    Transacao novaTransacao = new Transacao();
    
    try {
      Conta contaDestino = encontreUmaConta.execute(transacao.agenciaDestino(), transacao.digitoDestino());
      Conta contaOrigem = encontreUmaConta.execute(transacao.agenciaOrigem(), transacao.digitoOrigem());

      novaTransacao.setContaDestino(contaDestino);
      novaTransacao.setContaOrigem(contaOrigem);
      novaTransacao.setValor(transacao.valor());
      
      novaTransacao = transferenciaEntreContas.execute(novaTransacao);
    }
    catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }

    return ResponseEntity.status(HttpStatus.OK).body(novaTransacao);
  }

  @PostMapping("/depositar")
  public ResponseEntity<?> depositarConta(@RequestBody @Validated DepositoDto deposito) {
    Conta conta;
    try {
      conta = encontreUmaConta.execute(deposito.agencia(), deposito.digito());
      conta = depositar.execute(conta, deposito.valor());
    }
    catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }

    return ResponseEntity.status(HttpStatus.OK).body(conta);
  }

  @PostMapping("/sacar")
  public ResponseEntity<?> sacarConta(@RequestBody @Validated DepositoDto deposito) {
    Conta conta;
    try {
      conta = encontreUmaConta.execute(deposito.agencia(), deposito.digito());
      conta = sacar.execute(conta, deposito.valor());
    }
    catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }

    return ResponseEntity.status(HttpStatus.OK).body(conta);
  }
}
