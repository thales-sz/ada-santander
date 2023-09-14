package controller;

import java.util.List;

public interface ControllerImp<T> {
  T create();

  T update(T entity);

  void delete(int id);

  T findOneById(T entity);

  T findOneBySearchTerm(String searchTerm);

  List<T> findAll();
}
