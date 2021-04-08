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
        Category side = Category.SIDE;
        Category snack = Category.SNACK;
        Category dessert = Category.DESSERT;
        Category hot_drink = Category.HOT_DRINK;
        Category hard_drink = Category.HARD_DRINK;
        Category soft_drink = Category.SOFT_DRINK;


        // Setup order
        // Setup menu items
        MenuItem menuItem1 = new MenuItem(restaurant, child_meal, "Cheese Sticks", "Old favourites made with love",
                5.00, "https://images.unsplash.com/photo-1593895647433-5a608a3bd379?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NHx8Y2hlZXNlJTIwc3RpY2tzfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
                false, true, false, false, "100g",
                0.0);

        menuItem1.addAllergen(Allergen.GLUTEN);
        menuItem1.addAllergen(Allergen.PEANUTS);
        menuItemRepository.save(menuItem1);

        MenuItem menuItem2 = new MenuItem(restaurant, child_meal, "Macaroni and Cheese", "Cheesy Deliciousness", 6.0,
                "https://images.unsplash.com/photo-1543339531-242d0bc29010?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80",
                false, true, false, false, "200g", 0.0);

        menuItem2.addAllergen(Allergen.GLUTEN);
        menuItem2.addAllergen(Allergen.MILK);
        menuItem2.addAllergen(Allergen.SOYA);
        menuItemRepository.save(menuItem2);

        MenuItem menuItem3 = new MenuItem(restaurant, child_meal, "Burger and fries", "Specially made from Scottish " +
                "Angus beef and organic potatoes", 6.50, "https://images.unsplash" +
                ".com/photo-1543339531-242d0bc29010?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80",
                false, false, false, false, "300g", 0.0);

        menuItem3.addAllergen(Allergen.GLUTEN);
        menuItem3.addAllergen(Allergen.MUSTARD);
        menuItem3.addAllergen(Allergen.SESAME);
        menuItem3.addAllergen(Allergen.MILK);
        menuItemRepository.save(menuItem3);

        MenuItem menuItem4 = new MenuItem(restaurant, side, "Potato fries", "Specially made from organic Scottish " +
                "potatoes", 3.50, "https://images.unsplash.com/photo-1600339240932-226cff938b4f?ixlib=rb-1.2" +
                ".1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80", true, true
                , true, false, "200g", 0.0);
        menuItemRepository.save(menuItem4);

        MenuItem menuItem5 = new MenuItem(restaurant, side, "Beetroot and walnut salad", "Delicious ingredients with " +
                "chef’s special honey mustard dressing", 4.0, "https://images.unsplash" +
                ".com/photo-1561043433-aaf687c4cf04?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2" +
                ".1&auto=format&fit=crop&w=1050&q=80", false, true, false, false, "150g", 0.0);

        menuItem5.addAllergen(Allergen.MILK);
        menuItem5.addAllergen(Allergen.MUSTARD);
        menuItem5.addAllergen(Allergen.GLUTEN);
        menuItemRepository.save(menuItem5);

        MenuItem menuItem6 = new MenuItem(restaurant, snack, "Haggis Pakora", "Delicious fusion dish that combines a " +
                "taste of Scotland with an Indian flare", 5.0, "https://images.unsplash" +
                ".com/photo-1597559824960-df4d323435b9?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1" +
                ".2.1&auto=format&fit=crop&w=634&q=80", false, false, false, false, "200g", 0.0);

        menuItem6.addAllergen(Allergen.EGGS);
        menuItem6.addAllergen(Allergen.GLUTEN);
        menuItem6.addAllergen(Allergen.CELERY);
        menuItem6.addAllergen(Allergen.MILK);
        menuItem6.addAllergen(Allergen.NUTS);
        menuItem6.addAllergen(Allergen.SOYA);
        menuItemRepository.save(menuItem6);

        MenuItem menuItem7 = new MenuItem(restaurant, snack, "Deep fried chicken bites", "Feast on these delicious " +
                "homemade nugget kebabs", 6.0, "https://images.unsplash.com/photo-1562967915-92ae0c320a01?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80",
                false, false, false, false, "150g", 0.0);

        menuItem7.addAllergen(Allergen.MILK);
        menuItem7.addAllergen(Allergen.GLUTEN);
        menuItem7.addAllergen(Allergen.SESAME);
        menuItemRepository.save(menuItem7);

        MenuItem menuItem8 = new MenuItem(restaurant, snack, "Calamari carpaccio", "The best thing since sliced " +
                "bread", 6.0, "https://images.unsplash.com/photo-1535980156496-87fc2cfcb832?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80",
                false, false, false, false, "200g", 0.0);

        menuItem8.addAllergen(Allergen.CRUSTACEANS);
        menuItem8.addAllergen(Allergen.FISH);
        menuItemRepository.save(menuItem8);

        MenuItem menuItem9 = new MenuItem(restaurant, main, "Prawn Curry", "Delicious prawn curry, chef’s special " +
                "recipe", 10.00, "https://images.unsplash.com/photo-1559847844-5315695dadae?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1340&q=80",
                true, false, false, false, "750g", 0.0);

        menuItem9.addAllergen(Allergen.CRUSTACEANS);
        menuItem9.addAllergen(Allergen.FISH);
        menuItemRepository.save(menuItem9);

        MenuItem menuItem10 = new MenuItem(restaurant, main, "Pepperoni pizza", "Stone baked pizza topped with " +
                "pepperoni and rocket", 9.0, "https://images.unsplash.com/photo-1528137871618-79d2761e3fd5?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80",
                false, false, false, false, "500g", 0.0);

        menuItem10.addAllergen(Allergen.GLUTEN);
        menuItem10.addAllergen(Allergen.MILK);
        menuItemRepository.save(menuItem10);

        MenuItem menuItem11 = new MenuItem(restaurant, main, "Bean Burger", "Delicious vegan bean burger made with " +
                "love", 8.0, "https://images.unsplash.com/photo-1525059696034-4967a8e1dca2?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80",
                false, true, true, false, "4oz", 0.0);

        menuItem11.addAllergen(Allergen.GLUTEN);
        menuItem11.addAllergen(Allergen.CELERY);
        menuItemRepository.save(menuItem11);

        MenuItem menuItem12 = new MenuItem(restaurant, dessert, "Cheesecake", "This cheesecake will send you to " +
                "heaven", 6.0, "https://images.unsplash.com/photo-1565958011703-44f9829ba187?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=701&q=80",
                false, true, false, false, "200g", 0);

        menuItem12.addAllergen(Allergen.GLUTEN);
        menuItem12.addAllergen(Allergen.MILK);
        menuItemRepository.save(menuItem12);

        MenuItem menuItem13 = new MenuItem(restaurant, dessert, "Cheese Platter", "The best cheeses from the region " +
                "handpicked by the chef", 15.0, "https://images.unsplash.com/photo-1565958011703-44f9829ba187?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=701&q=80",
                false, true, false, false, "500g", 0);

        menuItem13.addAllergen(Allergen.GLUTEN);
        menuItem13.addAllergen(Allergen.MILK);
        menuItem13.addAllergen(Allergen.NUTS);
        menuItemRepository.save(menuItem13);

        MenuItem menuItem14 = new MenuItem(restaurant, dessert, "Vegan Cupcakes", "Vegan chocolate peanut butter " +
                "cakes", 13, "https://images.unsplash.com/photo-1537622289779-495ce4d68f54?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80",
                true, true, true, false, "3", 0);

        menuItem14.addAllergen(Allergen.PEANUTS);
        menuItem14.addAllergen(Allergen.SOYA);
        menuItemRepository.save(menuItem14);

        MenuItem menuItem15 = new MenuItem(restaurant, hot_drink, "Espresso", "As dark as your heart", 0.95, "https" +
                "://i2" +
                "-prod.mirror.co.uk/incoming/article17203196" +
                ".ece/ALTERNATES/s1200c/3_Tiny-glass-cup-of-espresso-coffee.jpg", true, true, true, false, "small", 0);
        menuItemRepository.save(menuItem15);

        MenuItem menuItem16 = new MenuItem(restaurant, soft_drink, "Coke", "Just a can of coke", 1.5,  "https" +
                "://delivery.pret.co.uk/dw/image/v2/ABBI_PRD/on/demandware" +
                ".static/-/Sites-pret-uk-master-catalog/default/dw97ca232d/products/Coke.jpg?sw=584&sh=584", false,
                true, true, false, "330ml", 0);
        menuItemRepository.save(menuItem16);

        MenuItem menuItem17 = new MenuItem(restaurant, hard_drink, "Tennants", "Yellow garbage juice", 3.5, "data" +
                ":image/jpeg;base64," +
                "/9j/4AAQSkZJRgABAQAAAQABAAD" +
                "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",
                false, true, true, true, "pint", 4);
        menuItemRepository.save(menuItem17);

    }

}
