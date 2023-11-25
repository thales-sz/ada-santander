package com.ada.banco.application.usecase.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ada.banco.domain.entity.Cliente;
import com.ada.banco.domain.entity.Conta;
import com.ada.banco.domain.entity.TipoContaEnum;
import com.ada.banco.infra.database.repository.ContaRepository;

@Service
public class CriarNovaConta {
    @Autowired
    private ContaRepository contaRepository;

    public Conta execute(Cliente cliente, TipoContaEnum tipo) throws Exception {
        Conta novaConta = Conta.gerarContaAleatoria(tipo);

        Conta contaExistente = contaRepository.findByAgenciaAndDigito(novaConta.getAgencia(), novaConta.getDigito());

        if (contaExistente != null) {
            throw new Exception("Já existe uma conta com essa agência e digito");
        }

        novaConta.setCliente(cliente);

        return contaRepository.save(novaConta);
    }
}
