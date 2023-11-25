package com.ada.banco.infra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ada.banco.application.usecase.CriarNovaConta;
import com.ada.banco.domain.entity.Conta;

@RestController
@RequestMapping("/api/v1/conta")
public class ContaController {

    @Autowired
    private CriarNovaConta criarNovaConta;

    @PostMapping
    public ResponseEntity<?> criarConta(@RequestBody Conta conta) throws Exception {
        Conta novaConta;
        try {
            novaConta = criarNovaConta.execute(conta);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(novaConta);
    }
}
