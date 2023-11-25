package com.ada.banco.application.usecase.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.banco.domain.entity.Conta;
import com.ada.banco.infra.database.repository.ContaRepository;

@Service
public class EncontreUmaConta {
  @Autowired
  private ContaRepository contaRepository;

  public Conta execute(Long agencia, Long digito) throws Exception {
    Conta conta = contaRepository.findByAgenciaAndDigito(agencia, digito);

    if (conta == null) {
      throw new Exception("Não existe uma conta com essa agência e digito");
    }

    return conta;
  }
}
