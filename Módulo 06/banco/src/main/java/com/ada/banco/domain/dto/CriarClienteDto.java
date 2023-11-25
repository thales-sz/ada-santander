package com.ada.banco.domain.dto;

import com.ada.banco.domain.entity.TipoContaEnum;

public record CriarClienteDto(String nome, String cpf, TipoContaEnum tipoConta) {
}
