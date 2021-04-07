package com.ialcoholic.foodees.foodee_service.models.restaurant;
import com.ialcoholic.foodees.foodee_service.models.restaurant.Table;
import com.ialcoholic.foodees.foodee_service.models.menu.MenuItem;


import java.util.List;

public class Restaurant {

    private Long id;
    private String name;
    private List<Table> tables;
    private List<MenuItem> menu;

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }
}
