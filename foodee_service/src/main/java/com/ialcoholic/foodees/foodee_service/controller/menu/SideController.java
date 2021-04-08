package com.ialcoholic.foodees.foodee_service.controller.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.Side;
import com.ialcoholic.foodees.foodee_service.repositories.menu.SideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SideController {

    @Autowired
    SideRepository sideRepository;

    @GetMapping(value="/sides")
    public ResponseEntity<List<Side>> getAllSides(){
        return new ResponseEntity<>(sideRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/sides/{id}")
    public ResponseEntity getSide(@PathVariable Long id){
        return new ResponseEntity<>(sideRepository.findById(id), HttpStatus.OK);
    }
}
