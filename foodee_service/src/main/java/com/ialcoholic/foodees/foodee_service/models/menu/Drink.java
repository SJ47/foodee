package com.ialcoholic.foodees.foodee_service.models.menu;

public abstract class Drink extends MenuItem {

    private boolean isAlcoholic;
    private int sizeML;

    public Drink(String name, String description, double price, String image, boolean isGlutenFree,
                 boolean isVegetarian, boolean isVegan, boolean isAlcoholic, int sizeML) {
        super(name, description, price, image, isGlutenFree, isVegetarian, isVegan);
        this.isAlcoholic = isAlcoholic;
        this.sizeML = sizeML;
    }

    public Drink() {
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    public int getSizeML() {
        return sizeML;
    }

    public void setSizeML(int sizeML) {
        this.sizeML = sizeML;
    }
}
