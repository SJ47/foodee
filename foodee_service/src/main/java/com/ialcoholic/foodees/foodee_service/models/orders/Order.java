package com.ialcoholic.foodees.foodee_service.models.orders;

import com.ialcoholic.foodees.foodee_service.models.menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Long id;
    private Long customerId;
    private String specialNotes;
    private List<MenuItem> orderItems;
    private int quantity;
//    quantity or just List.size?
    private double total;
    private Rating rating;

    public Order() {
        this.specialNotes = "";
        this.orderItems = new ArrayList<>();
        this.quantity = 0;
        this.total = 0;
        this.rating = null;
    }

//    Not sure about the constructor set up ^^^
//    Let me know your thoughts

//    NOTE: won't let me create an empty constructor

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    public List<MenuItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<MenuItem> orderItems) {
        this.orderItems = orderItems;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
