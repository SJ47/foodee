package com.ialcoholic.foodees.foodee_service.models.menu;

public class Snack extends Food {

    public Snack(String name, String description, double price, String image, boolean isGlutenFree,
                 boolean isVegetarian, boolean isVegan, int size) {
        super(name, description, price, image, isGlutenFree, isVegetarian, isVegan, size);
    }

    public Snack() {
    }
}
