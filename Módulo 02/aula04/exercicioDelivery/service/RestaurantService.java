package service;

import java.util.ArrayList;

import domain.Dish;
import domain.Restaurant;
import repository.RestaurantRepository;

public class RestaurantService {
  RestaurantRepository restaurantRepository;

  public RestaurantService(RestaurantRepository restaurantRepository) {
    this.restaurantRepository = restaurantRepository;
  }

  public void createRestaurant(String name, String address, ArrayList<Dish> menu) {
    Restaurant restaurant = new Restaurant(name, address, menu);
    this.restaurantRepository.createRestaurant(restaurant);
  }
}
