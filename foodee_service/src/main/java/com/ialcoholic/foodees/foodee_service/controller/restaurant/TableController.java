package com.ialcoholic.foodees.foodee_service.controller.restaurant;

import com.ialcoholic.foodees.foodee_service.models.restaurant.Table;
import com.ialcoholic.foodees.foodee_service.repositories.restaurant.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableController {

    @Autowired
    TableRepository tableRepository;

    @GetMapping(value="/tables")
    public ResponseEntity<List<Table>> getAllTables(){
        return new ResponseEntity(tableRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/tables/{id}")
    public ResponseEntity getTable(@PathVariable Long id){
        return new ResponseEntity<>(tableRepository.findById(id), HttpStatus.OK);
    }

}
