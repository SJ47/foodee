package com.ialcoholic.foodees.foodee_service.models.orders;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ialcoholic.foodees.foodee_service.models.menu.MenuItem;
import com.ialcoholic.foodees.foodee_service.models.people.Customer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties({"orders"})
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "special_notes")
    private String specialNotes;

    @JsonIgnoreProperties(value="order")
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<MenuItem> orderItems;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    @Column(name = "quantity")
    private int quantity;
//    quantity or just List.size?

    @Column(name = "total")
    private double total;

    @Column(name = "rating")
    private Rating rating;

    public Order(Customer customer) {
        this.customer = customer;
        this.specialNotes = "";
        this.orderItems = new ArrayList<>();
        this.quantity = 0;
        this.total = 0;
        this.rating = null;
    }

    public Order() {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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