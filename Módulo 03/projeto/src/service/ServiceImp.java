package service;
import java.util.List;
import java.util.Optional;

import domain.VehicleType;

public interface ServiceImp<T> {

  T create(String model, String color, VehicleType type);

  T update(Optional<T> entity);

  void delete(int id);

  T findOne(T entity);

  List<T> findAll();
}

