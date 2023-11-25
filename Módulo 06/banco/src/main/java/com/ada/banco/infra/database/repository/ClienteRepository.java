package com.ada.banco.infra.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ada.banco.domain.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
  Cliente findByCpf(String cpf);
}
