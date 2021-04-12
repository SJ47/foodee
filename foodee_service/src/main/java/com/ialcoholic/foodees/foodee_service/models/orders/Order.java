package com.ialcoholic.foodees.foodee_service.models.orders;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ialcoholic.foodees.foodee_service.models.menu.MenuItem;
import com.ialcoholic.foodees.foodee_service.models.people.Customer;
import org.hibernate.annotations.Cascade;

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

//    @JsonIgnoreProperties(value="order")
////    @OneToMany(mappedBy = "order")
//    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
//    private List<MenuItem> orderItems;

    @JsonIgnoreProperties(value = "orders")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "menu_items_orders",
            joinColumns = {@JoinColumn(name = "order_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="menu_item_id", nullable = false, updatable = false)}
    )
    private List<MenuItem> orderItems;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @Column(name = "quantity")
    private int quantity;
//    quantity or just List.size?

    @Column(name = "total")
    private double total;

    @Column(name = "rating")
    private Rating rating;

//    public Order(Customer customer) {
//        this.customer = customer;
//        this.specialNotes = "";
//        this.orderItems = new ArrayList<>();
//        this.quantity = 0;
//        this.total = 0;
//        this.rating = null;
//    }
//
//    public Order() {
//    }

    public Order(Customer customer, String specialNotes) {
        this.customer = customer;
        this.specialNotes = specialNotes;
        this.total = total;
        this.quantity = quantity;
        this.orderItems = new ArrayList<>();
        this.rating = null;
        this.payment = null;
    }

    public Order() {
    }

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

    public void addItemToOrder(MenuItem item) {
        this.orderItems.add(item);
        this.quantity += 1;
        this.total += item.getPrice();

//        System.out.println("ORDER: " + item);

    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
