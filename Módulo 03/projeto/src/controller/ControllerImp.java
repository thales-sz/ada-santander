package controller;

import java.util.List;

public interface ControllerImp<T> {
  T create(T entity);

  T update(T entity);

  void delete(int id);

  T findOne(T entity);

  List<T> findAll();
}
