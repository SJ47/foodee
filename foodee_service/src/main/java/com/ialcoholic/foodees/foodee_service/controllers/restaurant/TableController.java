package com.ialcoholic.foodees.foodee_service.controllers.restaurant;

import com.ialcoholic.foodees.foodee_service.models.restaurant.Restaurant;
import com.ialcoholic.foodees.foodee_service.models.restaurant.Table;
import com.ialcoholic.foodees.foodee_service.repositories.restaurant.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping(value = "/tables")
    public ResponseEntity<Table> postPirate(@RequestBody Table table){
        tableRepository.save(table);
        return new ResponseEntity<>(table, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/tables/{id}")
    public ResponseEntity<Table> updatePirate(@RequestBody Table table){
        tableRepository.save(table);
        return new ResponseEntity<>(table, HttpStatus.OK);
    }

    @DeleteMapping(value = "/tables/{id}")
    public ResponseEntity<Restaurant> deletePirate(@PathVariable Long id) {
        Table found = tableRepository.getOne(id);
        tableRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
