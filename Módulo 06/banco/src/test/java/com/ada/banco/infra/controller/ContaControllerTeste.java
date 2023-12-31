package com.ada.banco.infra.controller;

import java.math.BigDecimal;
import com.ada.banco.domain.dto.DepositoDto;
import com.ada.banco.domain.dto.TransferenciaDto;
import com.ada.banco.domain.entity.TipoContaEnum;
import com.ada.banco.infra.controller.conta.ContaController;
import com.ada.banco.infra.database.repository.ContaRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.ada.banco.domain.entity.Cliente;
import com.ada.banco.domain.entity.Conta;
import com.ada.banco.infra.database.repository.ClienteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class ContaControllerTeste {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ContaController contaController;

    @BeforeEach
    void beforeEach() {
        Conta conta1 = new Conta(1234L, 12L, new BigDecimal(500L), TipoContaEnum.CP);
        Conta conta2 = new Conta(5678L, 34L, new BigDecimal(500L), TipoContaEnum.CP);
        Cliente cliente1 = new Cliente("Thales", "123456789", conta1);
        Cliente cliente2 = new Cliente("Pyetra", "789456125", conta2);
        Cliente clienteSalvo1 = clienteRepository.save(cliente1);
        Cliente clienteSalvo2 = clienteRepository.save(cliente2);
        conta1.setCliente(clienteSalvo1);
        conta2.setCliente(clienteSalvo2);
        contaRepository.save(conta1);
        contaRepository.save(conta2);
    }

    @AfterEach
    void afterEach() {
        clienteRepository.deleteAll();
    }

    @Test
    void deveSerPossivelSacarDeUmaContaComSaldo() throws Exception {
        // Arrange
        String requestBody = objectMapper.writeValueAsString(new DepositoDto(1234L, 12L, new BigDecimal(250L)));

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/v1/conta/sacar")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isOk());

        Conta conta = contaRepository.findByAgenciaAndDigito(1234L, 12L);

        Assertions.assertEquals(250L, conta.getSaldo().longValue());
    }

    @Test
    void naoDeveSerPossivelSacarDeUmaContaSemSaldo() throws Exception {
        // Arrange
        String requestBody = objectMapper.writeValueAsString(new DepositoDto(1234L, 12L, new BigDecimal(600L)));

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/v1/conta/sacar")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());

        Conta conta = contaRepository.findByAgenciaAndDigito(1234L, 12L);

        Assertions.assertEquals(500L, conta.getSaldo().longValue());
    }

    @Test
    void deveSerPossivelDepositarEmUmaConta() throws Exception {
        // Arrange
        String requestBody = objectMapper.writeValueAsString(new DepositoDto(1234L, 12L, new BigDecimal(500L)));

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/v1/conta/depositar")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isOk());

        Conta conta = contaRepository.findByAgenciaAndDigito(1234L, 12L);

        Assertions.assertEquals(1000L, conta.getSaldo().longValue());
    }

    @Test
    void deveSerPossivelTransferirDeUmaContaParaOutra() throws Exception {
        // Arrange
        String requestBody = objectMapper.writeValueAsString(new TransferenciaDto(1234L, 12L, 5678L, 34L, new BigDecimal(250)));

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/v1/conta/transferir")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isOk());

        Conta conta1 = contaRepository.findByAgenciaAndDigito(1234L, 12L);
        Conta conta2 = contaRepository.findByAgenciaAndDigito(5678L, 34L);

        Assertions.assertEquals(250L, conta1.getSaldo().longValue());
        Assertions.assertEquals(750L, conta2.getSaldo().longValue());
    }

    @Test
    void deveSerRegistradoUmaTransacaoDoTipoDepositoAoSacar() throws Exception {
        // Arrange
        DepositoDto novoDeposito = new DepositoDto(1234L, 12L, new BigDecimal(500L));

        contaController.depositarConta(novoDeposito);

        Conta conta = contaRepository.findByAgenciaAndDigito(1234L, 12L);

        Assertions.assertEquals(conta.getTransacao().get(0).getTipoTransacao().toString(), "DEPOSITO");
    }

    @Test
    void deveSerRegistradoUmaTransacaoDoTipoSaqueAoSacar() throws Exception {
        // Arrange
        DepositoDto novoSaque = new DepositoDto(1234L, 12L, new BigDecimal(500L));

        contaController.sacarConta(novoSaque);

        Conta conta = contaRepository.findByAgenciaAndDigito(1234L, 12L);

        Assertions.assertEquals(conta.getTransacao().get(0).getTipoTransacao().toString(), "SAQUE");
    }
}

