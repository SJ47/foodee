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
        Category child_meal = Category.CHILD_MEAL;
        Category main = Category.MAIN;

        // Setup order
        // Setup menu items
        MenuItem menuItem1 = new MenuItem(restaurant, child_meal, "Cheese Sticks", "Old favourites made with love",
                5.00, "https://URLHERE", false, true, false, false, 100,
                0.0);

        menuItem1.addAllergen(Allergen.GLUTEN);
        menuItem1.addAllergen(Allergen.PEANUTS);
        menuItemRepository.save(menuItem1);
    }

}
