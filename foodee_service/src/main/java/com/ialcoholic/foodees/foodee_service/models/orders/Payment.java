package com.ialcoholic.foodees.foodee_service.models.orders;

public class Payment {

    private Long id;
    private Order order;
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
