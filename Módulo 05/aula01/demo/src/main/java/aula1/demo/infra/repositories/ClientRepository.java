package aula1.demo.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aula1.demo.domain.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
  
}