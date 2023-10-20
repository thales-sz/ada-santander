package aula1.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import aula1.demo.domain.entity.Product;
import aula1.demo.infra.repositories.ProductRepository;

public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public Product create(Product product) {
    return this.productRepository.save(product);
  }

  public Product update(Product product) {
    return this.productRepository.save(product);
  }

  public void delete(String id) {
    this.productRepository.deleteById(id);
  }

  public Product findById(String id) {
    return this.productRepository.findById(id).orElse(null);
  }

  public List<Product> findAll() {
    return this.productRepository.findAll();
  }

  public Product findByName(String name) {
    return this.productRepository.findByName(name);
  }
}
