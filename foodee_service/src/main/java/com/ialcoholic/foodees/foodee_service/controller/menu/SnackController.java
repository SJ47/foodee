package com.ialcoholic.foodees.foodee_service.controller.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.Snack;
import com.ialcoholic.foodees.foodee_service.repositories.menu.SnackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SnackController {

    @Autowired
    SnackRepository snackRepository;

    @GetMapping(value="/snacks")
    public ResponseEntity<List<Snack>> getAllSnacks(){
        return new ResponseEntity<>(snackRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/snacks/{id}")
    public ResponseEntity getSnack(@PathVariable Long id){
        return new ResponseEntity<>(snackRepository.findById(id), HttpStatus.OK);
    }
}
