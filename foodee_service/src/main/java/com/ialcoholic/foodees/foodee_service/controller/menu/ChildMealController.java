package com.ialcoholic.foodees.foodee_service.controller.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.ChildMeal;
import com.ialcoholic.foodees.foodee_service.repositories.menu.ChildMealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChildMealController {

    @Autowired
    ChildMealRepository childMealRepository;

    @GetMapping(value="/childmeals")
    public ResponseEntity<List<ChildMeal>> getAllChildMeals(){
        return new ResponseEntity(childMealRepository.findAll(), HttpStatus.OK);
    }
}
