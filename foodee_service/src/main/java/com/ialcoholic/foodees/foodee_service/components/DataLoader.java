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
        Customer laureline = new Customer("Laureline", "Vaucoy", "laureline.vaucoy@fakeemail.com");
        Customer alan = new Customer("Alan", "Partridge", "alan.p@fakeemail.com");
        Customer scott = new Customer("Scott", "Johnston", "scott.j@fakeemail.com");
        Customer tom = new Customer("Tom", "Stocker", "tom.s@fakeemail.com");
        Customer meghan = new Customer("Meghan", "Windsor", "megsandharry4eva@fakeemail.com");
        Customer harry = new Customer("Harry", "Windsor", "harryluvsmeg@fakeemail.com");
        Customer james = new Customer("James", "Bond", "jamesb@fakeemail.com");
        Customer penny = new Customer("Penny", "Rogers", "pennyr@fakeemail.com");
        Customer thandiwe = new Customer("Thandiwe", "Newton", "thandie@fakeemail.com");
        Customer melody = new Customer("Melody", "Sanders", "melody@yahooyeah.com");
        Customer charlotte = new Customer("Charlotte", "Windsor", "charlieW@gmailee.com");
        Customer scarlett = new Customer("Scarlett", "Johnson", "scarlett@gmailee.com");
        Customer john = new Customer("John", "Travolta", "johnt@hotmailoo.com");
        Customer thor = new Customer("Thor", "Kingston", "thor@yahooyeah.com");

        customerRepository.save(renee);
        customerRepository.save(reneesHusband);
        customerRepository.save(laureline);
        customerRepository.save(alan);
        customerRepository.save(scott);
        customerRepository.save(tom);
        customerRepository.save(meghan);
        customerRepository.save(harry);
        customerRepository.save(james);
        customerRepository.save(penny);
        customerRepository.save(thandiwe);
        customerRepository.save(melody);
        customerRepository.save(charlotte);
        customerRepository.save(scarlett);
        customerRepository.save(john);
        customerRepository.save(thor);

        // Setup menu items
        // KIDS //
        MenuItem menuItem1 = new MenuItem(restaurant, child_meal, "Cheese sticks", "Old favourites made with love. Only the finest Scottish cheese used with delicious farm " +
                "baked bread breadcrumbs.",
                5.00, "https://images.unsplash.com/photo-1593895647433-5a608a3bd379?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NHx8Y2hlZXNlJTIwc3RpY2tzfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
                false, true, false, false, "100g",
                0.0);

        menuItem1.addAllergen(Allergen.GLUTEN);
        menuItem1.addAllergen(Allergen.PEANUTS);
        menuItemRepository.save(menuItem1);

        MenuItem menuItem2 = new MenuItem(restaurant, child_meal, "Macaroni and cheese", "Cheesy Deliciousness. Who doesn't love a good old fashion mac and cheese?", 6.0,
                "https://images.unsplash.com/photo-1543339531-242d0bc29010?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80",
                false,true, false, false, "200g", 0.0);

        menuItem2.addAllergen(Allergen.GLUTEN);
        menuItem2.addAllergen(Allergen.MILK);
        menuItem2.addAllergen(Allergen.SOYA);
        menuItemRepository.save(menuItem2);

        MenuItem menuItem3 = new MenuItem(restaurant, child_meal, "Burger and fries", "Specially made from Scottish " +
                "Angus beef and organic potatoes", 6.50, "https://i.dailymail.co.uk/i/pix/2017/11/08/16/4623608900000578-0-image-a-9_1510156892900.jpg",
                false, false, false, false, "300g", 0.0);

        menuItem3.addAllergen(Allergen.GLUTEN);
        menuItem3.addAllergen(Allergen.MUSTARD);
        menuItem3.addAllergen(Allergen.SESAME);
        menuItem3.addAllergen(Allergen.MILK);
        menuItemRepository.save(menuItem3);

        MenuItem menuItem18 = new MenuItem(restaurant, child_meal, "Fish fingers", "Specially made with fish caught off Scotland's coast " +
                "and mushy peas", 6.20, "https://movingmountainsfoods.com/wp-content/uploads/2020/12/Fish-FInger-banner-image.jpg",
                false, false, false, false, "250g", 0.0);

        menuItem18.addAllergen(Allergen.GLUTEN);
        menuItem18.addAllergen(Allergen.MILK);
        menuItem18.addAllergen(Allergen.FISH);
        menuItemRepository.save(menuItem18);

        MenuItem menuItem19 = new MenuItem(restaurant, child_meal, "Chicken nuggets", "So, so tasty ", 5.50, "https://www.aheadofthyme.com/wp-content/uploads/2020/06/easy-" +
                "homemade-chicken-nuggets-8.jpg",
                false, false, false, false, "300g", 0.0);

        menuItem19.addAllergen(Allergen.GLUTEN);
        menuItem19.addAllergen(Allergen.MUSTARD);
        menuItem19.addAllergen(Allergen.SESAME);
        menuItemRepository.save(menuItem19);

        MenuItem menuItem20 = new MenuItem(restaurant, child_meal, "Spagetti and meat sauce", "Made with the chef's special Italian recipe ", 7.50, "https://images.unsplash." +
                "com/photo-1530114722439-f5cbd4dad762?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80",
                false, false, false, false, "400g", 0.0);

        menuItem20.addAllergen(Allergen.GLUTEN);
        menuItem20.addAllergen(Allergen.MILK);
        menuItemRepository.save(menuItem20);

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


        MenuItem menuItem21 = new MenuItem(restaurant, side, "Chorizo and sweet potato salad", "Packed with goodness. It's a meal in itself", 7.50, "https://img.delicious.com.au/g6CEWI5G/w759-h506-" +
                "cfill/del/2016/01/chorizo-and-sweet-potato-salad-26203-2.jpg", false, true, false, false, "150g", 0.0);

        menuItem21.addAllergen(Allergen.MILK);
        menuItem21.addAllergen(Allergen.MUSTARD);
        menuItem21.addAllergen(Allergen.GLUTEN);
        menuItemRepository.save(menuItem21);

        MenuItem menuItem22 = new MenuItem(restaurant, side, "fried mushrooms", "An old favourite made with mushrooms imported from Denmark. Hand selected for their " +
                "unique Danish mushroom flavour", 4.50, "https://www.errenskitchen.com/wp-content/uploads/2016/01/" +
                "garlic-breaded-mushrooms-feature.jpg", false, true, false, false, "150g", 0.0);

        menuItem22.addAllergen(Allergen.MILK);
        menuItem22.addAllergen(Allergen.MUSTARD);
        menuItem22.addAllergen(Allergen.GLUTEN);
        menuItemRepository.save(menuItem22);

        MenuItem menuItem23 = new MenuItem(restaurant, side, "Prawn and crouton salad", "A  hearty prawn salad, chicken of the sea ", 6.50, "https://images.unsplash.com/photo-1551248429" +
                "-40975aa4de74?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1495&q=80", false, false, false, false, "200g", 0.0);

        menuItem23.addAllergen(Allergen.MILK);
        menuItem23.addAllergen(Allergen.GLUTEN);
        menuItem23.addAllergen(Allergen.CRUSTACEANS);

        menuItemRepository.save(menuItem23);


        // SNACKS //
        MenuItem menuItem6 = new MenuItem(restaurant, snack, "Haggis pakora", "Delicious fusion dish that combines a " +
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

        MenuItem menuItem24 = new MenuItem(restaurant, snack, "Scotch eggs", "Old pubs faves. Eggs selected from the the finest Scottish hens", 5.0, "https://ichef.bbci.co.uk/food/ic/food_16x9_1600/recipes/" +
                "scotcheggs_85851_16x9.jpg", false, true, false, false, "200g", 0.0);

        menuItem24.addAllergen(Allergen.EGGS);
        menuItem24.addAllergen(Allergen.GLUTEN);
        menuItem24.addAllergen(Allergen.CELERY);
        menuItem24.addAllergen(Allergen.MILK);
        menuItemRepository.save(menuItem24);

        MenuItem menuItem25 = new MenuItem(restaurant, snack, "Chicken wings", "Double deep-frying chicken wings - crispy and light", 6.0,
                "https://blog.opentable.com/wp-content/uploads/sites/108/2019/01/blog-BeetleCat-Credit-Andrew-Isabella-copy.jpeg", false, false, false, false, "200g", 0.0);

        menuItem25.addAllergen(Allergen.EGGS);
        menuItem25.addAllergen(Allergen.GLUTEN);
        menuItem25.addAllergen(Allergen.CELERY);
        menuItem25.addAllergen(Allergen.SESAME);
        menuItemRepository.save(menuItem25);

        MenuItem menuItem26 = new MenuItem(restaurant, snack, "Maple-glazed nuts & bacon", "Chopped pieces of bacon and pure maple syrup are combined with peanuts in this perfectly sweet and salty snack.", 6.0,
                "https://paleogrubs.com/wp-content/uploads/2020/05/roasted-nuts-6.jpg", true, false, false, false, "200g", 0.0);


        menuItem26.addAllergen(Allergen.GLUTEN);
        menuItem26.addAllergen(Allergen.SESAME);
        menuItem26.addAllergen(Allergen.PEANUTS);

        menuItemRepository.save(menuItem26);


        // MAINS //
        MenuItem menuItem9 = new MenuItem(restaurant, main, "Prawn curry", "Delicious prawn curry, chef’s special " +
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

        MenuItem menuItem11 = new MenuItem(restaurant, main, "Bean burger", "Delicious vegan bean burger made with " +
                "love", 8.0, "https://images.unsplash.com/photo-1525059696034-4967a8e1dca2?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80",
                false, true, true, false, "4oz", 0.0);

        menuItem11.addAllergen(Allergen.GLUTEN);
        menuItem11.addAllergen(Allergen.CELERY);
        menuItemRepository.save(menuItem11);

        MenuItem menuItem27 = new MenuItem(restaurant, main, "Salmon and zucchini", "Fresh water Scottish salmon lightly grilled to perfection", 10.0, "https://images.unsplash.com" +
                "/photo-1467003909585-2f8a72700288?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=934&q=80",
                false, false, false, false, "500g", 0.0);

        menuItem27.addAllergen(Allergen.CELERY);
        menuItem27.addAllergen(Allergen.FISH);
        menuItemRepository.save(menuItem27);

        MenuItem menuItem28 = new MenuItem(restaurant, main, "Steak and vegetables", "Fresh water Scottish salmon lightly grilled to perfection", 10.0,
                "https://images.unsplash.com/photo-1432139509613-5c4255815697?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2." +
                        "1&auto=format&fit=crop&w=932&q=80",
                false, false, false, false, "500g", 0.0);

        menuItem28.addAllergen(Allergen.GLUTEN);
        menuItem28.addAllergen(Allergen.CELERY);
        menuItemRepository.save(menuItem28);

        MenuItem menuItem29 = new MenuItem(restaurant, main, "Dumplings", "Pockets of flavour, so delicious you'll want seconds", 10.0,
                "https://images.unsplash.com/photo-1534422298391-e4f8c172dddb?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1." +
                        "2.1&auto=format&fit=crop&w=1950&q=80",
                false, false, false, false, "400g", 0.0);

        menuItem29.addAllergen(Allergen.GLUTEN);
        menuItem29.addAllergen(Allergen.CELERY);
        menuItem29.addAllergen(Allergen.CRUSTACEANS);

        menuItemRepository.save(menuItem29);



        // DESSERTS //
        MenuItem menuItem12 = new MenuItem(restaurant, dessert, "Cheesecake", "This cheesecake will send you to " +
                "heaven. Made with pure Scottish cream and cream cheese and a drizzle of lemon with berries on top.", 6.0, "https://" +
                "images.unsplash.com/photo-1565958011703-44f9829ba187?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=701&q=80",
                false, true, false, false, "200g", 0);

        menuItem12.addAllergen(Allergen.GLUTEN);
        menuItem12.addAllergen(Allergen.MILK);
        menuItemRepository.save(menuItem12);

        MenuItem menuItem13 = new MenuItem(restaurant, dessert, "Cheese platter", "The best cheeses from the region " +
                "handpicked by the chef", 15.0, "https://images.unsplash.com/photo-1561668048-fe9c092832e0?ixlib=rb-1.2.1&ixid=" +
                "MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1051&q=80Z",
                false, true, false, false, "500g", 0);

        menuItem13.addAllergen(Allergen.GLUTEN);
        menuItem13.addAllergen(Allergen.MILK);
        menuItem13.addAllergen(Allergen.NUTS);
        menuItemRepository.save(menuItem13);

        MenuItem menuItem14 = new MenuItem(restaurant, dessert, "Vegan cupcakes", "Vegan chocolate peanut butter " +
                "cakes", 13, "https://images.unsplash.com/photo-1537622289779-495ce4d68f54?ixid" +
                "=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80",
                true, true, true, false, "3", 0);

        menuItem14.addAllergen(Allergen.PEANUTS);
        menuItem14.addAllergen(Allergen.SOYA);
        menuItemRepository.save(menuItem14);

        MenuItem menuItem30 = new MenuItem(restaurant, dessert, "Glazed donuts", "Don't knock 'em till you try them. These deep fried delights will have you " +
                "begging for more.", 6.0, "https://images.unsplash.com/photo-1514517220017-8ce97a34a7b6?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1" +
                ".2.1&auto=format&fit=crop&w=934&q=80",
                false, true, false, false, "150g", 0);

        menuItem30.addAllergen(Allergen.GLUTEN);
        menuItem30.addAllergen(Allergen.MILK);
        menuItem30.addAllergen(Allergen.NUTS);
        menuItemRepository.save(menuItem30);

        MenuItem menuItem31 = new MenuItem(restaurant, dessert, "Oreo sunday", "Ice cream, caramel and oreo cookies, enough said", 6.0,
                "https://images.unsplash.com/photo-1563805042-7684c019e1cb?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=582&q=80",
                false, true, false, false, "150g", 0);

        menuItem31.addAllergen(Allergen.GLUTEN);
        menuItem31.addAllergen(Allergen.MILK);
        menuItem31.addAllergen(Allergen.NUTS);
        menuItemRepository.save(menuItem31);

        MenuItem menuItem32 = new MenuItem(restaurant, dessert, "Rum baba", "Classic Rum Baba made with Scottish rum", 7.0,
                "https://unsplash.com/photos/zECxA3ZL9eM",
                false, true, false, true, "150g", 1);

        menuItem32.addAllergen(Allergen.GLUTEN);
        menuItem32.addAllergen(Allergen.MILK);
        menuItem32.addAllergen(Allergen.NUTS);
        menuItemRepository.save(menuItem31);


        // DRINKS
        MenuItem menuItem15 = new MenuItem(restaurant, hot_drink, "Espresso", "As dark as your heart. This wake-me-up is a perfect shot of caffeine to get you going.", 1.20, "https" +
                "://i2" +
                "-prod.mirror.co.uk/incoming/article17203196" +
                ".ece/ALTERNATES/s1200c/3_Tiny-glass-cup-of-espresso-coffee.jpg", true, true, true, false, "small", 0);
        menuItemRepository.save(menuItem15);

        MenuItem menuItem33 = new MenuItem(restaurant, hot_drink, "Cappucino", "Also called breakfast in Italy. Try our creamy cappucinos with chocolate sprinkles made with organic coffee.", 1.50, "https://static01." +
                "nyt.com/images/2015/10/02/fashion/02CAPP3SUB/02CAPP3SUB-superJumbo.jpg", true, true, true, false, "medium", 0);
        menuItemRepository.save(menuItem33);

        MenuItem menuItem34 = new MenuItem(restaurant, hot_drink, "Tea", "A pot of soothing tea. We usually serve Ceylon tea, but every now and then a bag of Earl Grey slips in", 1.50, "https://www.imore.com/sites/imore.com/files/styles/large/" +
                "public/field/image/2020/07/tea-pot-milada-vigerova-unsplash-hero.jpg", true, true, true, false, "medium", 0);
        menuItemRepository.save(menuItem34);

        MenuItem menuItem39 = new MenuItem(restaurant, hot_drink, "Hot chocolate", "Made with belgian chocolate and fresh Scottish milk and cream. Melt in your mouth", 1.20, "https://images.unsplash.com/" +
                "photo-1546334169-864ef455d3f8?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8aG90JTIwY2hvY29sYXRlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
                true, true, true, false, "small", 0);
        menuItemRepository.save(menuItem39);

        MenuItem menuItem40 = new MenuItem(restaurant, hot_drink, "Rooibos tea", "A soothing tea made from Red Bush in South Africa", 1.20, "https:" +
                "//images.unsplash.com/photo-1598099968270-f7a302af6d50?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OTN8fHRlYXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
                true, true, true, false, "small", 0);
        menuItemRepository.save(menuItem40);

        MenuItem menuItem41 = new MenuItem(restaurant, hot_drink, "Café latte", "A french way of saying coffee with milk. We add a lot of frothy full cream milk - enjoy.", 1.20, "https://images.unsplash.com" +
                "/photo-1528830639624-fc16697bb8e7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1350&q=80",
                true, true, true, false, "small", 0);
        menuItemRepository.save(menuItem41);


        MenuItem menuItem16 = new MenuItem(restaurant, soft_drink, "Coke", "Just a can of coke to some, to others this is a drink made in heaven", 1.5,  "https" +
                "://delivery.pret.co.uk/dw/image/v2/ABBI_PRD/on/demandware" +
                ".static/-/Sites-pret-uk-master-catalog/default/dw97ca232d/products/Coke.jpg?sw=584&sh=584", false,
                true, true, false, "330ml", 0);
        menuItemRepository.save(menuItem16);

        MenuItem menuItem35 = new MenuItem(restaurant, soft_drink, "Lemonade", "Homemade lemonade. Our chef picked up this recipe while travelling around the coast of Italy. Thirst quenching brilliance.", 1.5,
                "https://images.unsplash.com/photo-1606943932434-2f21e1c54ef2?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8bGVtb25hZGV8ZW5" +
                        "8MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60", false,
                true, true, false, "500ml", 0);
        menuItemRepository.save(menuItem35);

        MenuItem menuItem36 = new MenuItem(restaurant, soft_drink, "`Pink lemonade", "Grapefruit infused lemonade, simply delicious", 1.5,
                "https://images.unsplash.com" +
                        "/photo-1601912343940-b110df3f303d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjl8fG9yYW5nZSUyMHNvZGF8ZW58MHx8MHx8&ixlib=rb-1" +
                        ".2.1&auto=format&fit=crop&w=800&q=60", false,
                true, true, false, "330ml", 0);
        menuItemRepository.save(menuItem36);

        MenuItem menuItem42 = new MenuItem(restaurant, soft_drink, "Jarritos", "Jarritos is a Mexican thirst buster. Try this pineapple soda. Tropical paradise in a glass.", 2.5,  "https://images." +
                "unsplash.com/photo-1613509891877-d0b5adcde63b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDF8fG9yYW5nZSUyMHNvZGF8ZW58MHx8MHx8&ixlib=rb-1.2." +
                "1&auto=format&fit=crop&w=800&q=60", false,
                true, true, false, "370ml", 0);
        menuItemRepository.save(menuItem42);

        MenuItem menuItem43 = new MenuItem(restaurant, soft_drink, "Pepsi", "Why not have a Pepsi? It is a drink unlike any other. The sugar content is low on this one.", 1.5,  "https:" +
                "//images.unsplash.com/photo-1571114865995-9545aedcd241?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Njd8fHNvZGF8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=" +
                "format&fit=crop&w=800&q=60", false,
                true, true, false, "330ml", 0);
        menuItemRepository.save(menuItem43);

        MenuItem menuItem44 = new MenuItem(restaurant, soft_drink, "Iced coffee", "A favuorite hot drink transformed into a icy surprise. Try it with whipped cream on top.", 2.5,  "https://images.unsplash." +
                "com/photo-1542674817-7c03d278561a?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NTh8fGljZWQlMjBjb2ZmZWV8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60", false,
                true, true, false, "400ml", 0);
        menuItemRepository.save(menuItem44);


        MenuItem menuItem17 = new MenuItem(restaurant, hard_drink, "Tennent's lager", "Yellow garbage juice some may call it, for others this is lager made for the gods.", 3.5, "https://images.unsplash.com/photo-1579106391617-bf9edae36907?ixid=" +
                "MnwxMjA3fDB8MHxzZWFyY2h8NXx8Z2xhc3MlMjBvZiUyMGJlZXJ8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
                false, true, true, true, "pint", 4);
        menuItemRepository.save(menuItem17);

        MenuItem menuItem37 = new MenuItem(restaurant, hard_drink, "BrewDog ale", "Scotland's own brewery brings you this delicious craft ale. Go on, give it a try.", 3.5, "https://images.unsplash.com/photo-1579106391617" +
                "-bf9edae36907?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8Z2xhc3MlMjBvZiUyMGJlZXJ8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
                false, true, true, true, "pint", 4);
        menuItemRepository.save(menuItem37);

        MenuItem menuItem38 = new MenuItem(restaurant, hard_drink, "House red", "A special wine chosen by the chef. From the top wine yards in the world. Our chef knows best.", 3.5, "https://freestocks.org/fs/wp-content/uploads/2019/03/" +
                "glass_of_red_wine.jpg",
                false, true, true, true, "pint", 6);
        menuItemRepository.save(menuItem38);

        MenuItem menuItem45 = new MenuItem(restaurant, hard_drink, "House white", "A special white wine chosen by the chef", 3.5, "https://images.unsplash.com/" +
                "photo-1601924376620-fac275e571b3?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8d2hpdGUlMjB3aW5lfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60",
                false, true, true, true, "pint", 6);
        menuItemRepository.save(menuItem45);

        MenuItem menuItem46 = new MenuItem(restaurant, hard_drink, "Cider", "A specially selected cider. You won't regret choosing this.", 3.5,
                "https://images.unsplash.com/photo-1618162803775-cd146ebac4c5?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8Z2xhc3MlMjBvZiUyMGJlZXJ8ZW58MHx8MHx8&ixlib=rb-1.2." +
                        "1&auto=format&fit=crop&w=800&q=60",
                false, true, true, true, "pint", 6);
        menuItemRepository.save(menuItem46);

        MenuItem menuItem47 = new MenuItem(restaurant, hard_drink, "Craft beer", "A specially selected craft beer. You won't regret choosing this.", 3.5, "https://images.unsplash.com" +
                "/photo-1579106391617-bf9edae36907?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8Z2xhc3MlMjBvZiUyMGJlZXJ8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=60"
                ,
                false, true, true, true, "pint", 6);
        menuItemRepository.save(menuItem47);


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
        restaurant.addMenuItem(menuItem18);
        restaurant.addMenuItem(menuItem19);
        restaurant.addMenuItem(menuItem20);
        restaurant.addMenuItem(menuItem21);
        restaurant.addMenuItem(menuItem22);
        restaurant.addMenuItem(menuItem23);
        restaurant.addMenuItem(menuItem24);
        restaurant.addMenuItem(menuItem25);
        restaurant.addMenuItem(menuItem26);
        restaurant.addMenuItem(menuItem27);
        restaurant.addMenuItem(menuItem28);
        restaurant.addMenuItem(menuItem29);
        restaurant.addMenuItem(menuItem30);
        restaurant.addMenuItem(menuItem31);
        restaurant.addMenuItem(menuItem32);
        restaurant.addMenuItem(menuItem33);
        restaurant.addMenuItem(menuItem34);
        restaurant.addMenuItem(menuItem35);
        restaurant.addMenuItem(menuItem36);
        restaurant.addMenuItem(menuItem37);
        restaurant.addMenuItem(menuItem38);
        restaurant.addMenuItem(menuItem39);
        restaurant.addMenuItem(menuItem40);
        restaurant.addMenuItem(menuItem41);
        restaurant.addMenuItem(menuItem42);
        restaurant.addMenuItem(menuItem43);
        restaurant.addMenuItem(menuItem44);
        restaurant.addMenuItem(menuItem45);
        restaurant.addMenuItem(menuItem46);
        restaurant.addMenuItem(menuItem47);




        restaurantRepository.save(restaurant);

        // Setup orders
        Order order1 = new Order(renee, "with a smile");
        order1.addItemToOrder(menuItem1);
        order1.addItemToOrder(menuItem2);
        orderRepository.save(order1);
        renee.addOrderToOrders(order1);
        customerRepository.save(renee);

        Order order2 = new Order(alan, "with a bigger plate");
        order1.addItemToOrder(menuItem28);
        order1.addItemToOrder(menuItem30);
        orderRepository.save(order2);
        alan.addOrderToOrders(order2);
        customerRepository.save(alan);


        // Setup tables
        Table table1 = new Table(restaurant, 1, 4);
        Table table2 = new Table(restaurant, 2, 3);
        Table table3 = new Table(restaurant, 3,2 );
        Table table4 = new Table(restaurant, 4,6 );
        Table table5 = new Table(restaurant, 5,4 );
        Table table6 = new Table(restaurant, 6,2 );
        Table table7 = new Table(restaurant, 7,3 );
        Table table8 = new Table(restaurant, 8,3 );

        table2.addCustomer(renee);
        table2.addCustomer(reneesHusband);
        table3.addCustomer(alan);
        table3.addCustomer(scott);
        table3.addCustomer(tom);
        tableRepository.save(table1);
        tableRepository.save(table2);
        tableRepository.save(table3);
        tableRepository.save(table4);
        tableRepository.save(table5);
        tableRepository.save(table6);
        tableRepository.save(table7);
        tableRepository.save(table8);

        restaurant.addTable(table1);
        restaurant.addTable(table2);
        restaurant.addTable(table3);
        restaurantRepository.save(restaurant);

//        Setup an admin
        Admin admin1 = new Admin("gmcstockings", "ladyboss21");
        adminRepository.save(admin1);

//        Another journey test
        Customer bob = new Customer("Bob", "Bob", "bobemail@email.com");
        MenuItem carrot = new MenuItem(restaurant, side, "Lasagne", "Lasagne made from grain fed Angus beef", 1, "https://foodtasia.com/wp-content/uploads/2020/05/" +
                "lasagna-29-683x1024.jpg",
                false, false, true, false, "Medium", 0);
        Order carrotOrder = new Order(bob, "no carrots");

        customerRepository.save(bob);
        menuItemRepository.save(carrot);

        carrotOrder.addItemToOrder(carrot);

        bob.addOrderToOrders(carrotOrder);
        customerRepository.save(bob);
        orderRepository.save(carrotOrder);

        Order testOrder = new Order(bob, "");
        orderRepository.save(testOrder);




    }

}
