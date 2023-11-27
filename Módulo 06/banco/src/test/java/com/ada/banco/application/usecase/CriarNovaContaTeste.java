package com.ada.banco.application.usecase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.ada.banco.application.usecase.conta.CriarNovaConta;
import com.ada.banco.domain.entity.Cliente;
import com.ada.banco.domain.entity.TipoContaEnum;
import com.ada.banco.infra.database.repository.ClienteRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class CriarNovaContaTeste {

  @Autowired
  private CriarNovaConta criarNovaConta;

  @Autowired
  private ClienteRepository clienteRepository;

  @BeforeEach
  void beforeEach() {
    Cliente novoCliente = new Cliente("Thales", "123456");
    clienteRepository.save(novoCliente);
  }

  @Test
  public void deveCriarUmaNova() throws Exception {
    Cliente salvoCliente = clienteRepository.findByCpf("123456");

    criarNovaConta.execute(salvoCliente, TipoContaEnum.CC);

    Cliente clienteComConta = clienteRepository.findByCpf("123456");
    
    Assertions.assertNotNull(clienteComConta.getConta());
  }
}
