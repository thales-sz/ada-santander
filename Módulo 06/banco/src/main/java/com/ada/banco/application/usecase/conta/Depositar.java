package com.ada.banco.application.usecase.conta;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.banco.domain.entity.Conta;
import com.ada.banco.domain.entity.TipoTransacaoEnum;
import com.ada.banco.domain.entity.Transacao;
import com.ada.banco.infra.database.repository.ContaRepository;
import com.ada.banco.infra.database.repository.TransacaoRepository;

@Service
public class Depositar {
  @Autowired
  private ContaRepository contaRepository;
  @Autowired
  private TransacaoRepository transacaoRepository;
  
  public Conta execute(Conta conta, BigDecimal valor) {
    conta.setSaldo(conta.getSaldo().add(valor));

    Transacao transacao = new Transacao(conta, valor, TipoTransacaoEnum.DEPOSITO);

    transacaoRepository.save(transacao);

    conta.setTransacao(transacao);

    return contaRepository.save(conta);
  }
}
