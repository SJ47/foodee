package com.ialcoholic.foodees.foodee_service.models.menu;

public class Dessert extends Food {

    public Dessert(String name, String description, double price, String image, boolean isGlutenFree,
                   boolean isVegetarian, boolean isVegan, int size) {
        super(name, description, price, image, isGlutenFree, isVegetarian, isVegan, size);
    }

    public Dessert() {
    }
}
