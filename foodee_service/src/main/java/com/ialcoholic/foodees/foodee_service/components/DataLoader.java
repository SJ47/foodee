package com.ialcoholic.foodees.foodee_service.components;

import com.ialcoholic.foodees.foodee_service.models.menu.Allergen;
import com.ialcoholic.foodees.foodee_service.models.menu.Category;
import com.ialcoholic.foodees.foodee_service.models.menu.MenuItem;
import com.ialcoholic.foodees.foodee_service.models.orders.Order;
import com.ialcoholic.foodees.foodee_service.models.people.Admin;
import com.ialcoholic.foodees.foodee_service.models.people.Customer;
import com.ialcoholic.foodees.foodee_service.models.restaurant.Restaurant;
import com.ialcoholic.foodees.foodee_service.models.restaurant.Table;
import com.ialcoholic.foodees.foodee_service.repositories.menu.MenuItemRepository;
import com.ialcoholic.foodees.foodee_service.repositories.orders.OrderRepository;
import com.ialcoholic.foodees.foodee_service.repositories.people.AdminRepository;
import com.ialcoholic.foodees.foodee_service.repositories.people.CustomerRepository;
import com.ialcoholic.foodees.foodee_service.repositories.restaurant.RestaurantRepository;
import com.ialcoholic.foodees.foodee_service.repositories.restaurant.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    MenuItemRepository menuItemRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    TableRepository tableRepository;

    @Autowired
    AdminRepository adminRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        // Setup a restaurant
        Restaurant restaurant = new Restaurant("Foodee", 55.865680, -4.257140);
        restaurantRepository.save(restaurant);

        // Setup categories
        Category child_meal = Category.CHILD_MEAL;
        Category main = Category.MAIN;
        Category side = Category.SIDE;
        Category snack = Category.SNACK;
        Category dessert = Category.DESSERT;
        Category hot_drink = Category.HOT_DRINK;
        Category hard_drink = Category.HARD_DRINK;
        Category soft_drink = Category.SOFT_DRINK;

        // Setup customers
        Customer renee = new Customer("Renee", "Graham", "renee.graham@fakeemail.com");
        Customer reneesHusband = new Customer("Mister", "Man", "mister.man@fakeemail.com");
        customerRepository.save(renee);
        customerRepository.save(reneesHusband);

        // Setup menu items
        // KIDS //
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

        // SIDES //
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

        // SNACKS //
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

        // MAINS //
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

        // DESSERTS //
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

        // DRINKS
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
                "https://www.telegraph.co.uk/content/dam/men/2016/05/13/tennents-588470_trans_NvBQzQNjv4Bq2mG3lyVb0qwi9Nuwg-8hyWM4S1u_kNqQtETCuvfEn_0.jpg",
                false, true, true, true, "pint", 4);
        menuItemRepository.save(menuItem17);

        restaurant.addMenuItem(menuItem1);
        restaurant.addMenuItem(menuItem2);
        restaurant.addMenuItem(menuItem3);
        restaurant.addMenuItem(menuItem4);
        restaurant.addMenuItem(menuItem5);
        restaurant.addMenuItem(menuItem6);
        restaurant.addMenuItem(menuItem7);
        restaurant.addMenuItem(menuItem8);
        restaurant.addMenuItem(menuItem9);
        restaurant.addMenuItem(menuItem10);
        restaurant.addMenuItem(menuItem11);
        restaurant.addMenuItem(menuItem12);
        restaurant.addMenuItem(menuItem13);
        restaurant.addMenuItem(menuItem14);
        restaurant.addMenuItem(menuItem15);
        restaurant.addMenuItem(menuItem16);
        restaurant.addMenuItem(menuItem17);
        restaurantRepository.save(restaurant);

        // Setup orders
        Order order1 = new Order(renee, "with a smile");
        order1.addItemToOrder(menuItem1);
        order1.addItemToOrder(menuItem2);
        orderRepository.save(order1);
        renee.addOrderToOrders(order1);
        customerRepository.save(renee);

        // Setup tables
        Table table1 = new Table(restaurant, 1, 4);
        Table table2 = new Table(restaurant, 2, 2);
        table2.addCustomer(renee);
        table2.addCustomer(reneesHusband);
        tableRepository.save(table1);
        tableRepository.save(table2);

        restaurant.addTable(table1);
        restaurant.addTable(table2);
        restaurantRepository.save(restaurant);

//        Setup an admin
        Admin admin1 = new Admin("gmcstockings", "ladyboss21");
        adminRepository.save(admin1);

//        Another journey test
        Customer bob = new Customer("Bob", "Bob", "bobemail@email.com");
        MenuItem carrot = new MenuItem(restaurant, side, "carrot", "carrot", 1, "image",
                true, true, true, false, "1", 0);
        Order carrotOrder = new Order(bob, "no carrots");

        customerRepository.save(bob);
        menuItemRepository.save(carrot);

        carrotOrder.addItemToOrder(carrot);

        bob.addOrderToOrders(carrotOrder);
        customerRepository.save(bob);
        orderRepository.save(carrotOrder);




    }

}
