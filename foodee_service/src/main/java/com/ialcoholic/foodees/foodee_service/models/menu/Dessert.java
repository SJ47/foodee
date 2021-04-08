package com.ialcoholic.foodees.foodee_service.models.menu;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "desserts")
public class Dessert extends Food {

    public Dessert(String name, String description, double price, String image, boolean isGlutenFree,
                   boolean isVegetarian, boolean isVegan, int size) {
        super(name, description, price, image, isGlutenFree, isVegetarian, isVegan, size);
    }

    public Dessert() {
    }
}
