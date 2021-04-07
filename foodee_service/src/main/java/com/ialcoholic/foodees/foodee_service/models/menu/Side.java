package com.ialcoholic.foodees.foodee_service.models.menu;

public class Side extends Food {

    public Side(String name, String description, double price, String image, boolean isGlutenFree,
                boolean isVegetarian, boolean isVegan, int size) {
        super(name, description, price, image, isGlutenFree, isVegetarian, isVegan, size);
    }

    public Side() {
    }
}
