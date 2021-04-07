package com.ialcoholic.foodees.foodee_service.controller.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.HotDrink;
import com.ialcoholic.foodees.foodee_service.repositories.menu.HotDrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotDrinkController {

    @Autowired
    HotDrinkRepository hotDrinkRepository;

    @GetMapping(value="/hotdrinks")
    public ResponseEntity<List<HotDrink>> getAllHotDrinks(){
        return new ResponseEntity<>(hotDrinkRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/hotdrinks/{id}")
    public ResponseEntity getHotDrink(@PathVariable Long id){
        return new ResponseEntity<>(hotDrinkRepository.findById(id), HttpStatus.OK);
    }
}
