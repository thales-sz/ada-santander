package com.ada.banco.application.usecase.transacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.banco.domain.entity.Transacao;
import com.ada.banco.infra.database.repository.TransacaoRepository;

@Service
public class RetornarListaDeTransacao {
  @Autowired
  private TransacaoRepository transacaoRepository;

  public List<Transacao> execute() throws Exception {
    List<Transacao> transacoes = transacaoRepository.findAll();

    if (transacoes.isEmpty()) {
      throw new Exception("Não existem transações cadastradas");
    }

    return transacoes;
  }
}
