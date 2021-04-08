package com.ialcoholic.foodees.foodee_service.models.menu;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hot_drinks")
public class HotDrink extends Drink {

    public HotDrink(String name, String description, double price, String image, boolean isGlutenFree,
                    boolean isVegetarian, boolean isVegan, boolean isAlcoholic, int sizeML) {
        super(name, description, price, image, isGlutenFree, isVegetarian, isVegan, isAlcoholic, sizeML);
    }

    public HotDrink() {
    }
}
