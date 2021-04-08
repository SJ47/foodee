package com.ialcoholic.foodees.foodee_service.controllers.people;

import com.ialcoholic.foodees.foodee_service.models.people.Admin;
import com.ialcoholic.foodees.foodee_service.repositories.people.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    @GetMapping(value="/admins")
    public ResponseEntity<List<Admin>> getAllAdmins(){
        return new ResponseEntity<>(adminRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/admins/{id}")
    public ResponseEntity getAdmin(@PathVariable Long id){
        return new ResponseEntity<>(adminRepository.findById(id), HttpStatus.OK);
    }
}
