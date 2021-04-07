package com.ialcoholic.foodees.foodee_service.models.menu;

public enum Allergen {

    CELERY("Celery"),
    GLUTEN("Cereals containing gluten"),
    CRUSTACEANS("Crustaceans"),
    EGGS("Eggs"),
    FISH("Fish"),
    LUPIN("Lupin"),
    MILK("Milk"),
    MOLLUSCS("Molluscs"),
    MUSTARD("Mustard"),
    NUTS("Nuts"),
    PEANUTS("Peanuts"),
    SESAME("Sesame seeds"),
    SOYA("Soya"),
    SULPHITES("Sulphur dioxide");

    private String allergen;

    Allergen(String allergen) {
        this.allergen = allergen;
    }

    public String getAllergen() {
        return allergen;
    }

}
