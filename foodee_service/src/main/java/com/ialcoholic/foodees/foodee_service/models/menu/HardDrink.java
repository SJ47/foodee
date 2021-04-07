package com.ialcoholic.foodees.foodee_service.models.menu;

public class HardDrink extends Drink {

    public HardDrink(String name, String description, double price, String image, boolean isGlutenFree,
                     boolean isVegetarian, boolean isVegan, boolean isAlcoholic, int sizeML) {
        super(name, description, price, image, isGlutenFree, isVegetarian, isVegan, isAlcoholic, sizeML);
    }

    public HardDrink() {
    }
}
