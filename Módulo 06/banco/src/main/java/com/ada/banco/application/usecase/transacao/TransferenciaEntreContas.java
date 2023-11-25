package com.ada.banco.application.usecase.transacao;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.banco.domain.entity.Conta;
import com.ada.banco.domain.entity.TipoTransacaoEnum;
import com.ada.banco.domain.entity.Transacao;
import com.ada.banco.infra.database.repository.TransacaoRepository;

@Service
public class TransferenciaEntreContas {
  @Autowired
  private TransacaoRepository transacaoRepository;
  public Transacao execute(Transacao transacao) throws Exception {
    Conta origem = transacao.getContaOrigem();
    Conta destino = transacao.getContaDestino();
    BigDecimal valor = transacao.getValor();

    if (origem.getSaldo().compareTo(valor) < 0) {
      throw new Exception("Saldo insuficiente");
    }

    origem.setSaldo(origem.getSaldo().subtract(valor));
    destino.setSaldo(destino.getSaldo().add(valor));
    transacao.setTipoTransacao(TipoTransacaoEnum.TRANSFERENCIA);

    Transacao novaTransacao = transacaoRepository.save(transacao);
    origem.setTransacao(novaTransacao);
    destino.setTransacao(novaTransacao);

    return novaTransacao;
  }
}
