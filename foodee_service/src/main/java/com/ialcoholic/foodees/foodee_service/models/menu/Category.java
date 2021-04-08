package com.ialcoholic.foodees.foodee_service.models.menu;

public enum Category {

    HOT_DRINK("Hot Drink"),
    SOFT_DRINK("Soft Drink"),
    HARD_DRINK("Hard Drink"),
    SNACK("Snack"),
    SIDE("Side"),
    MAIN("Main"),
    DESSERT("Dessert"),
    CHILD_MEAL("Child Meal");

    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }}
