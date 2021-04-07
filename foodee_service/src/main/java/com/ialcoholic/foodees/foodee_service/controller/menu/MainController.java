package com.ialcoholic.foodees.foodee_service.controller.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.Main;
import com.ialcoholic.foodees.foodee_service.repositories.menu.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    MainRepository mainRepository;

    @GetMapping(value="/mains")
    public ResponseEntity<List<Main>> getAllMains(){
        return new ResponseEntity<>(mainRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/mains/{id}")
    public ResponseEntity getMain(@PathVariable Long id){
        return new ResponseEntity<>(mainRepository.findById(id), HttpStatus.OK);
    }
}
