package com.ialcoholic.foodees.foodee_service.controllers.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.Category;
import com.ialcoholic.foodees.foodee_service.models.menu.MenuItem;
import com.ialcoholic.foodees.foodee_service.models.people.Customer;
import com.ialcoholic.foodees.foodee_service.repositories.menu.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    // Get ALL VEGETARIAN menu items
    @GetMapping(value="/menu_items/vegetarian")
    public ResponseEntity<List<MenuItem>> getAllVegetarianItems(){
        return new ResponseEntity<>(menuItemRepository.findAllVegetariansNative(), HttpStatus.OK);
    }


//    @GetMapping(value="/menu_items/params")
//    public ResponseEntity<List<MenuItem>> getMenuItems(
//            @RequestParam(name="name", required = false) String name,
//            @RequestParam(name="category", required = false) String category,
//            @RequestParam(name="vegetarian", required = false) boolean isVegetarian
//    ){
//
//        // Return all vegetarian for a specific category
//        if (category!=null && isVegetarian) {
//
//            String upperCaseCategory = category.toUpperCase();
//            Category foundCategory = Category.valueOf(upperCaseCategory);
//            return new ResponseEntity<>(menuItemRepository.findAllByCategoryAndVegetarian(foundCategory), HttpStatus.OK);
//        }
//
//        if (name!=null){
//            return new ResponseEntity(menuItemRepository.findByName(name), HttpStatus.OK);
//        }
//
//        if (category!=null){
//            String upperCaseCategory = category.toUpperCase();
//            Category foundCategory = Category.valueOf(upperCaseCategory);
//            return new ResponseEntity<>(menuItemRepository.findAllByCategory(foundCategory), HttpStatus.OK);
//        }
//
//        if (isVegetarian){
//            return new ResponseEntity(menuItemRepository.findAllVegetariansNative(), HttpStatus.OK);
//        }
//
//        // Default return all foods
//        return new ResponseEntity<>(menuItemRepository.findAll(), HttpStatus.OK);
//    }


}
