package com.ada.banco.infra.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ada.banco.domain.entity.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, String> {
}
