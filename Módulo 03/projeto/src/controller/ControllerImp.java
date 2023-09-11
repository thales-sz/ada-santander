package controller;

import java.util.List;

import domain.VehicleType;

public interface ControllerImp<T> {
  T create(T entity);

  T update(T entity);

  void delete(int id);

  T findOneById(T entity);

  T findOneBySearchTerm(String searchTerm);

  List<T> findAll();
}
