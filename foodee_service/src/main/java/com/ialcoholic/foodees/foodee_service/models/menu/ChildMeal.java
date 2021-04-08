package com.ialcoholic.foodees.foodee_service.models.menu;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "child_meals")
public class ChildMeal extends Food {

    public ChildMeal(String name, String description, double price, String image, boolean isGlutenFree,
                     boolean isVegetarian, boolean isVegan, int size) {
        super(name, description, price, image, isGlutenFree, isVegetarian, isVegan, size);
    }

    public ChildMeal() {
    }

}
