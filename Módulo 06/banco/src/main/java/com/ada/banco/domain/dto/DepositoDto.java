package com.ada.banco.domain.dto;

import java.math.BigDecimal;

public record DepositoDto(Long agencia, Long digito, BigDecimal valor) {
}
