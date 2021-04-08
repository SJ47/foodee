package com.ialcoholic.foodees.foodee_service.components;

import com.ialcoholic.foodees.foodee_service.models.menu.Allergen;
import com.ialcoholic.foodees.foodee_service.models.menu.Category;
import com.ialcoholic.foodees.foodee_service.models.menu.MenuItem;
import com.ialcoholic.foodees.foodee_service.models.restaurant.Restaurant;
import com.ialcoholic.foodees.foodee_service.repositories.menu.MenuItemRepository;
import com.ialcoholic.foodees.foodee_service.repositories.restaurant.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MenuItemRepository menuItemRepository;


    @Autowired
    RestaurantRepository restaurantRepository;


    public DataLoader() {
    }


    public void run(ApplicationArguments args) {

        // Setup a restaurant
        Restaurant restaurant = new Restaurant("Foodee");
        restaurantRepository.save(restaurant);

        // Setup Category
// Setup Category
        Category child_meal = Category.CHILD_MEAL;
        Category main = Category.MAIN;
        Category side = Category.SIDE;
        Category snack = Category.SNACK;
        Category dessert = Category.DESSERT;
        Category hot_drink = Category.HOT_DRINK;
        Category hard_drink = Category.HARD_DRINK;
        Category soft_drink = Category.SOFT_DRINK;

        // Setup order
        // Setup menu items
        MenuItem cheeseSticks = new MenuItem(restaurant, child_meal, "Cheese Sticks", "Old favourites made with love",
                5.00, "https://URLHERE", false, true, false, false, 100,
                0.0);
        cheeseSticks.addAllergen(Allergen.GLUTEN);
        cheeseSticks.addAllergen(Allergen.PEANUTS);
        menuItemRepository.save(cheeseSticks);

        MenuItem cheeseBurger = new MenuItem(restaurant, main, "Cheese Burger", "Classic cheeseburger",
                9.99, "https://URLHERE", false, false, false, false, 100,
                0.0);
        menuItemRepository.save(cheeseBurger);

        MenuItem steakPie = new MenuItem(restaurant, main, "Steak Pie", "Classic steak pie",
                7.50, "https://URLHERE", false, false, false, false, 100,
                0.0);
        menuItemRepository.save(steakPie);

        // Setup menu items
// KIDS //
        MenuItem menuItem1 = new MenuItem(restaurant, child_meal, "Cheese Sticks", "Old favourites made with love",
                5.00, "https://images.unsplash.com/photo-1593895647433-5a608a3bd379?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NHx8Y2hlZXNlJTIwc3RpY2tzfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
                false, true, false, false, 100,
                0.0);
        menuItem1.addAllergen(Allergen.GLUTEN);
        menuItem1.addAllergen(Allergen.PEANUTS);
        menuItemRepository.save(menuItem1);
        MenuItem menuItem2 = new MenuItem(restaurant, child_meal, "Macaroni and Cheese", "Cheesy Deliciousness", 6.0,
                "https://images.unsplash.com/photo-1543339531-242d0bc29010?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80",
                false, true, false, false, 200, 0.0);
        menuItem2.addAllergen(Allergen.GLUTEN);
        menuItem2.addAllergen(Allergen.MILK);
        menuItem2.addAllergen(Allergen.SOYA);
        menuItemRepository.save(menuItem2);
        MenuItem menuItem3 = new MenuItem(restaurant, child_meal, "Burger and fries", "Specially made from Scottish " +
                "Angus beef and organic potatoes", 6.50, "https://images.unsplash" +
                ".com/photo-1543339531-242d0bc29010?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80",
                false, false, false, false, 300, 0.0);
        menuItem3.addAllergen(Allergen.GLUTEN);
        menuItem3.addAllergen(Allergen.MUSTARD);
        menuItem3.addAllergen(Allergen.SESAME);
        menuItem3.addAllergen(Allergen.MILK);
        menuItemRepository.save(menuItem3);
// SIDES //
        MenuItem menuItem4 = new MenuItem(restaurant, side, "Potato fries", "Specially made from organic Scottish " +
                "potatoes", 3.50, "https://images.unsplash.com/photo-1600339240932-226cff938b4f?ixlib=rb-1.2" +
                ".1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80", true, true
                , true, false, 300, 0.0);
        menuItemRepository.save(menuItem4);
        MenuItem menuItem5 = new MenuItem(restaurant, side, "Beetroot and walnut salad", "Delicious ingredients with " +
                "chef's special honey mustard dressing", 4.0, "https://images.unsplash" +
                ".com/photo-1561043433-aaf687c4cf04?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2" +
                ".1&auto=format&fit=crop&w=1050&q=80", false, true, false, false, 150, 0.0);
        menuItem5.addAllergen(Allergen.MILK);
        menuItem5.addAllergen(Allergen.MUSTARD);
        menuItem5.addAllergen(Allergen.GLUTEN);
        menuItemRepository.save(menuItem5);
    }

}
