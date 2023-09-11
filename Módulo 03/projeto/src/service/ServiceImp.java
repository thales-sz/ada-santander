package service;

import java.util.List;

public interface ServiceImp<T> {

  T create(T entity);

  T update(T entity);

  void delete(int id);

  T findOneById(T entity);

  T findOneBySearchTerm(String searchTerm);

  List<T> findAll();
}

