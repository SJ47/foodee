package com.ialcoholic.foodees.foodee_service.models.restaurant;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ialcoholic.foodees.foodee_service.models.menu.MenuItem;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@javax.persistence.Table(name = "restaurants")
//otherwise it is recognised as the Table class
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties(value="restaurant")
    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
    private List<Table> tables;

    @JsonIgnoreProperties(value="restaurant")
    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
    private List<MenuItem> menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.tables = new ArrayList<>();
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

    public void addTable(Table table) {
        this.tables.add(table);
    }

    public void addMenuItem(MenuItem item) {
        this.menu.add(item);
    }
}
