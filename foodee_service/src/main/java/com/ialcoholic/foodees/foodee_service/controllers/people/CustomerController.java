package com.ialcoholic.foodees.foodee_service.controllers.people;

import com.ialcoholic.foodees.foodee_service.models.people.Customer;
import com.ialcoholic.foodees.foodee_service.repositories.people.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/customers")
    public ResponseEntity<Customer> postPirate(@RequestBody Customer customer){
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/customers/{id}")
    public ResponseEntity<Customer> updatePirate(@RequestBody Customer customer){
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @DeleteMapping(value = "/customers/{id}")
    public ResponseEntity<Customer> deletePirate(@PathVariable Long id) {
        Customer found = customerRepository.getOne(id);
        customerRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}

