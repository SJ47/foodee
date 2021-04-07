package com.ialcoholic.foodees.foodee_service.controller.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.Dessert;
import com.ialcoholic.foodees.foodee_service.repositories.menu.DessertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DessertController {

    @Autowired
    DessertRepository dessertRepository;

    @GetMapping(value="/desserts")
    public ResponseEntity<List<Dessert>> getAllDesserts(){
        return new ResponseEntity<>(dessertRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/desserts/{id}")
    public ResponseEntity getDessert(@PathVariable Long id){
        return new ResponseEntity<>(dessertRepository.findById(id), HttpStatus.OK);
    }
}
