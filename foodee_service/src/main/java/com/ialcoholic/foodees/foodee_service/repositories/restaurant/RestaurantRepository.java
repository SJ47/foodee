package com.ialcoholic.foodees.foodee_service.repositories.restaurant;

import com.ialcoholic.foodees.foodee_service.models.restaurant.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
