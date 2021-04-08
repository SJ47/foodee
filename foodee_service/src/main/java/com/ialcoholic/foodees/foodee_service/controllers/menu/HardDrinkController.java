package com.ialcoholic.foodees.foodee_service.controllers.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.HardDrink;
import com.ialcoholic.foodees.foodee_service.repositories.menu.HardDrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HardDrinkController {

    @Autowired
    HardDrinkRepository hardDrinkRepository;

    @GetMapping(value="/harddrinks")
    public ResponseEntity<List<HardDrink>> getAllHardDrinks(){
        return new ResponseEntity<>(hardDrinkRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="harddrinks/{id}")
    public ResponseEntity getHardDrink(@PathVariable Long id){
        return new ResponseEntity<>(hardDrinkRepository.findById(id), HttpStatus.OK);
    }
}
