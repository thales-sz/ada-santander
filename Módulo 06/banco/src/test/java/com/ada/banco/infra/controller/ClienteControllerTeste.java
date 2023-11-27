package com.ada.banco.infra.controller;

import com.ada.banco.domain.dto.CriarClienteDto;
import com.ada.banco.domain.entity.TipoContaEnum;
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
import com.ada.banco.infra.controller.cliente.ClienteController;
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

  @Autowired
  private ClienteController clienteController;

  @BeforeEach
  void beforeEach() {
    clienteRepository.deleteAll();
  }

  @Test
  void criarCliente_ComSucesso_DeveRetornarStatus201() throws Exception {
    // Arrange
    String requestBody = objectMapper.writeValueAsString(new CriarClienteDto("Thales", "123456", TipoContaEnum.CC));

    // Act & Assert
    mockMvc.perform(MockMvcRequestBuilders
        .post("/api/v1/cliente")
        .contentType(MediaType.APPLICATION_JSON)
        .content(requestBody))
        .andExpect(MockMvcResultMatchers.status().isCreated());

    Cliente cliente = clienteRepository.findByCpf("123456");
    Assertions.assertNotNull(cliente);
  }

  @Test
  void criarCliente_JaExistente_DeveRetornarException() throws Exception {

    Cliente cliente = new Cliente("Thales", "123456");
    String requestBody = objectMapper.writeValueAsString(new CriarClienteDto("Thales", "123456", TipoContaEnum.CC));

    clienteRepository.save(cliente);

    mockMvc.perform(MockMvcRequestBuilders
        .post("/api/v1/cliente")
        .contentType(MediaType.APPLICATION_JSON)
        .content(requestBody))
        .andExpect(MockMvcResultMatchers.status().isBadRequest());
  }

  @Test
  void criarCliente_ComSucesso_DeveSalvarOCliente() throws Exception {
    CriarClienteDto cliente = new CriarClienteDto("Thales", "123456789", TipoContaEnum.CC);

    // when
    clienteController.criarCliente(cliente);

    // then
    Cliente clienteCriada = clienteRepository.findByCpf("123456789");

    Assertions.assertEquals("Thales", clienteCriada.getNome());
  }
}
