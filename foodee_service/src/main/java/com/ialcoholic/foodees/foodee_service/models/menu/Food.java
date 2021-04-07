package com.ialcoholic.foodees.foodee_service.models.menu;

public abstract class Food extends MenuItem {

    private int size;

    public Food(String name, String description, double price, String image, boolean isGlutenFree,
                boolean isVegetarian, boolean isVegan, int size) {
        super(name, description, price, image, isGlutenFree, isVegetarian, isVegan);
        this.size = size;
    }

    public Food() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
