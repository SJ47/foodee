package com.ialcoholic.foodees.foodee_service.models.menu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ialcoholic.foodees.foodee_service.models.restaurant.Restaurant;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "menu_items")
public abstract class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties({"menu_items"})
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "image")
    private String image;

    @Column(name = "gluten_free")
    private boolean isGlutenFree;

    @Column(name = "vegetarian")
    private boolean isVegetarian;

    @Column(name = "vegan")
    private boolean isVegan;

//    can we have this in the db if it's an enum?
    @Column(name = "allergens")
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
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
