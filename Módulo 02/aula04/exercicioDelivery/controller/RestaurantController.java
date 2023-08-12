package controller;

import java.util.ArrayList;

import domain.Dish;
import service.RestaurantService;

public class RestaurantController {
  RestaurantService restaurantService;
  public RestaurantController(RestaurantService restaurantService) {
    this.restaurantService = restaurantService;
  }

  public void createRestaurant(String name, String address, ArrayList<Dish> menu) {
    try {
      this.restaurantService.createRestaurant(name, address, menu);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
