package com.ada.banco.infra.controller;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.ada.banco.domain.entity.Cliente;
import com.ada.banco.infra.database.repository.ClienteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class ClienteControllerTeste {
  @Autowired
  private ObjectMapper objectMapper;

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private ClienteRepository clienteRepository;

  @Test
  void criarCliente_ComSucesso_DeveRetornarStatus201() throws Exception {
    // Arrange
    String requestBody = objectMapper.writeValueAsString(new Cliente("123456789", "João da Silva"));

    // Act & Assert
    mockMvc.perform(MockMvcRequestBuilders
        .post("/api/v1/cliente")
        .contentType(MediaType.APPLICATION_JSON)
        .content(requestBody))
        .andExpect(MockMvcResultMatchers.status().isCreated());

    Cliente cliente = clienteRepository.findByCpf("123456789");
    Assertions.assertNotNull(cliente);
  }
}
