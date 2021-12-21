package com.ialcoholic.foodees.foodee_service.controllers.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.Category;
import com.ialcoholic.foodees.foodee_service.models.menu.MenuItem;
import com.ialcoholic.foodees.foodee_service.models.orders.Order;
import com.ialcoholic.foodees.foodee_service.models.people.Customer;
import com.ialcoholic.foodees.foodee_service.repositories.menu.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class MenuItemController {

    @Autowired
    MenuItemRepository menuItemRepository;

//    For testing only in the first version of our frontend - later on only available under category

    // Get all menu items by category / main, side, dessert, child_meal, hot_drink, soft_drink, hard_drink, snack
    @GetMapping(value="/menu_items/category/{category}")
    public ResponseEntity<List<MenuItem>> getAllMenuItemsByCategory(@PathVariable String category){
        String upperCaseCategory = category.toUpperCase();
        Category foundCategory = Category.valueOf(upperCaseCategory);
        return new ResponseEntity<>(menuItemRepository.findAllByCategory(foundCategory), HttpStatus.OK);
    }

    // Get ALL menu items
    @GetMapping(value="/menu_items")
    public ResponseEntity<List<MenuItem>> getAllMenuItems(){
        return new ResponseEntity<>(menuItemRepository.findAll(), HttpStatus.OK);
    }

    // Get one menu item by menu ID
    @GetMapping(value="/menu_items/{id}")
    public ResponseEntity getMenu_item(@PathVariable Long id){
        return new ResponseEntity<>(menuItemRepository.findById(id), HttpStatus.OK);
    }

    // Get one menu item by name STRING
    @GetMapping(value="/menu_items/name/{name}")
    public ResponseEntity getMenuItemByName(@PathVariable String name){
        return new ResponseEntity<>(menuItemRepository.findByName(name), HttpStatus.OK);

    }

    // Get ALL VEGETARIAN menu items
    @GetMapping(value="/menu_items/vegetarian")
    public ResponseEntity<List<MenuItem>> getAllVegetarianItems(){
        return new ResponseEntity<>(menuItemRepository.findByIsVegetarianTrue(), HttpStatus.OK);
//        return new ResponseEntity<>(menuItemRepository.findAllVegetariansNative(), HttpStatus.OK);
    }

    // Get ALL VEGAN menu items
    @GetMapping(value="/menu_items/vegan")
    public ResponseEntity<List<MenuItem>> getAllVeganItems() {
        return new ResponseEntity<>(menuItemRepository.findByIsVeganTrue(), HttpStatus.OK);
    }

    // Get ALL {CATEGORY} + VEGETARIAN menu items
    @GetMapping(value="/menu_items/category/{category}/vegetarian")
    public ResponseEntity<List<MenuItem>> getAllMenuItemsByCategoryAndIsVegetarianTrue(@PathVariable String category){
        String upperCaseCategory = category.toUpperCase();
        Category foundCategory = Category.valueOf(upperCaseCategory);
        return new ResponseEntity<>(menuItemRepository.findAllMenuItemsByCategoryAndIsVegetarianTrue(foundCategory), HttpStatus.OK);
    }

    // Get ALL {CATEGORY} + VEGAN menu items
    @GetMapping(value="/menu_items/category/{category}/vegan")
    public ResponseEntity<List<MenuItem>> getAllMenuItemsByCategoryAndIsVeganTrue(@PathVariable String category){
        String upperCaseCategory = category.toUpperCase();
        Category foundCategory = Category.valueOf(upperCaseCategory);
        return new ResponseEntity<>(menuItemRepository.findAllMenuItemsByCategoryAndIsVeganTrue(foundCategory), HttpStatus.OK);
    }

    // Get ALL DRINKS (Hot, Soft, and Hard)
    @GetMapping(value="/menu_items/drinks")
    public ResponseEntity<List<MenuItem>> getAllDrinks(){
        List<MenuItem> allHotDrinks = menuItemRepository.findAllByCategory(Category.HOT_DRINK);
        List<MenuItem> allSoftDrinks = menuItemRepository.findAllByCategory(Category.SOFT_DRINK);
        List<MenuItem> allHardDrinks = menuItemRepository.findAllByCategory(Category.HARD_DRINK);

        ArrayList allDrinks = new ArrayList<MenuItem>();
        allDrinks.add(allHotDrinks);
        allDrinks.add(allSoftDrinks);
        allDrinks.add(allHardDrinks);

        return new ResponseEntity(allDrinks, HttpStatus.OK);
    }

    @PostMapping(value= "/menu_items")
    public ResponseEntity<MenuItem> postMenuItem(@RequestBody MenuItem menuItem) {
        menuItemRepository.save(menuItem);
        return new ResponseEntity<>(menuItem, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/menu_items/{id}")
    public ResponseEntity<MenuItem> updateMenuItem(@RequestBody MenuItem menuItem) {
        menuItemRepository.save(menuItem);
        return new ResponseEntity<>(menuItem, HttpStatus.OK);
    }

    @DeleteMapping(value = "/menu_items/{id}")
    public ResponseEntity<MenuItem> deleteMenuItem(@PathVariable Long id) {
        MenuItem found = menuItemRepository.getOne(id);
        menuItemRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
