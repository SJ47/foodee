package com.ialcoholic.foodees.foodee_service.controllers.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.SoftDrink;
import com.ialcoholic.foodees.foodee_service.repositories.menu.SoftDrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SoftDrinkController {

    @Autowired
    SoftDrinkRepository softDrinkRepository;

    @GetMapping(value="/softdrinks")
    public ResponseEntity<List<SoftDrink>> getAllSoftDrinks(){
        return new ResponseEntity<>(softDrinkRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/softdrinks/{id}")
    public ResponseEntity getSoftDrink(@PathVariable Long id){
        return new ResponseEntity<>(softDrinkRepository.findById(id), HttpStatus.OK);
    }
}
