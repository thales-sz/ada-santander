package repository;

import java.util.ArrayList;

import domain.Restaurant;

public class RestaurantRepository {
  ArrayList<Restaurant> restaurants;

  public void createRestaurant(Restaurant restaurant) {
    this.restaurants.add(restaurant);
  }
}
