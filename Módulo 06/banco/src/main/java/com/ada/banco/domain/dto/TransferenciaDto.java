package com.ada.banco.domain.dto;

import java.math.BigDecimal;

public record TransferenciaDto(Long agenciaOrigem, Long digitoOrigem, Long agenciaDestino, Long digitoDestino, BigDecimal valor) {
}
