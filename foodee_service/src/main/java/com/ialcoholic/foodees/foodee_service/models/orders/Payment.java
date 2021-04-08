package com.ialcoholic.foodees.foodee_service.models.orders;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    Should this be a one to one with the order?
//    @JsonIgnoreProperties(value="payment") ??
    @OneToOne(mappedBy = "payment") //fetch type?
    private Order order;

    @Column(name = "credit_card_info")
    private int creditCardInfo;
//    Placeholder - waiting to see what Stripe will need :)

    public Payment(Order order) {
        this.order = order;
    }

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(int creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }
}
