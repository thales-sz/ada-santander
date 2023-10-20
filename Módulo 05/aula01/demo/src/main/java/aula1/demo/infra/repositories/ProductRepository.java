package aula1.demo.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aula1.demo.domain.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
  public Product findByName(String name);
}
