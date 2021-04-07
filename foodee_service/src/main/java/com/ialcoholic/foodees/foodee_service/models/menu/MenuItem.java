package com.ialcoholic.foodees.foodee_service.models.menu;

import java.util.ArrayList;

public abstract class MenuItem {

    private Long id;
    private Long restaurantId;
    private String name;
    private String description;
    private double price;
    private String image;
    private boolean isGlutenFree;
    private boolean isVegetarian;
    private boolean isVegan;
    private ArrayList<Allergen> allergens;

    public MenuItem(String name, String description, double price, String image, boolean isGlutenFree,
                    boolean isVegetarian, boolean isVegan) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.isGlutenFree = isGlutenFree;
        this.isVegetarian = isVegetarian;
        this.isVegan = isVegan;
        this.allergens = new ArrayList<>();

//        TEAM NOTE: can we initiate with populated array list of allergens?

    }

    public MenuItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public ArrayList<Allergen> getAllergens() {
        return allergens;
    }

    public void setAllergens(ArrayList<Allergen> allergens) {
        this.allergens = allergens;
    }
}
