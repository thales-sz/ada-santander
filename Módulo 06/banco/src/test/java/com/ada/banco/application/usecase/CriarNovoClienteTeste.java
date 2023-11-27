package com.ada.banco.application.usecase;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.ada.banco.application.usecase.cliente.CriarNovoCliente;
import com.ada.banco.domain.dto.CriarClienteDto;
import com.ada.banco.domain.entity.Cliente;
import com.ada.banco.domain.entity.Conta;
import com.ada.banco.domain.entity.TipoContaEnum;
import com.ada.banco.infra.database.repository.ClienteRepository;


@ExtendWith(MockitoExtension.class)
public class CriarNovoClienteTeste {

    @InjectMocks
    private CriarNovoCliente criarNovoCliente;

    @Mock
    private ClienteRepository clienteRepository;

    @Test
    public void deveCriarNovoCliente() throws Exception {
        // Given
        CriarClienteDto cliente = new CriarClienteDto("Thales", "123456", TipoContaEnum.CC);

        CriarClienteDto novoCliente = new CriarClienteDto("Thales", "123456", TipoContaEnum.CC);

        criarNovoCliente.execute(cliente);

        // Then
        Assertions.assertAll(
                () -> Assertions.assertEquals("Thales", novoCliente.nome())
        );
    }

     @Test
    public void deveLancarExceptionCasoOClienteJaExista() throws Exception {
        // Given
        CriarClienteDto clienteNovo = new CriarClienteDto("Thales", "123456", TipoContaEnum.CC);

        Cliente cliente = new Cliente("Thales", "123456");

        Mockito.when(clienteRepository.findByCpf(clienteNovo.cpf())).thenReturn(cliente); // Stub no mockito

        // When Then
        Throwable throwable = Assertions.assertThrows(
                Exception.class,
                () -> criarNovoCliente.execute(clienteNovo)
        );

        Assertions.assertEquals("Já existe um Cliente com esse CPF", throwable.getMessage());
    }
}
