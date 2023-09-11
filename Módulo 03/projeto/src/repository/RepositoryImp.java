package repository;

import java.util.List;

public interface RepositoryImp<T> {

  T create(T entity);

  T update(T entity);

  void delete(int id);

  boolean findOneById(T entity);

  T findOneBySearchTerm(String searchTerm);

  List<T> findAll();
}