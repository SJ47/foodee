package com.ialcoholic.foodees.foodee_service.controllers.restaurant;

import com.ialcoholic.foodees.foodee_service.models.people.Customer;
import com.ialcoholic.foodees.foodee_service.models.restaurant.Restaurant;
import com.ialcoholic.foodees.foodee_service.repositories.restaurant.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantRepository restaurantRepository;

    @GetMapping(value="/restaurants")
    public ResponseEntity<List<Restaurant>> getAllRestaurants(){
        return new ResponseEntity<>(restaurantRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/restaurants/{id}")
    public ResponseEntity getRestaurant(@PathVariable Long id){
        return new ResponseEntity<>(restaurantRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/restaurants")
    public ResponseEntity<Restaurant> postPirate(@RequestBody Restaurant restaurant){
        restaurantRepository.save(restaurant);
        return new ResponseEntity<>(restaurant, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/restaurants/{id}")
    public ResponseEntity<Restaurant> updatePirate(@RequestBody Restaurant restaurant){
        restaurantRepository.save(restaurant);
        return new ResponseEntity<>(restaurant, HttpStatus.OK);
    }

    @DeleteMapping(value = "/restaurants/{id}")
    public ResponseEntity<Restaurant> deletePirate(@PathVariable Long id) {
        Restaurant found = restaurantRepository.getOne(id);
        restaurantRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
