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

    private String cardHolder;
    private String cardNumber;
    private String cardExpiryMonth;
    private String cardExpiryYear;
    private String cardCvv;

    public Payment(Order order, int creditCardInfo, String cardHolder, String cardNumber, String cardExpiryMonth, String cardExpiryYear, String cardCvv) {
        this.order = order;
        this.creditCardInfo = creditCardInfo;
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.cardExpiryMonth = cardExpiryMonth;
        this.cardExpiryYear = cardExpiryYear;
        this.cardCvv = cardCvv;
    }

//    public Payment(Order order) {
//        this.order = order;
//    }

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

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    public void setCardExpiryMonth(String cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
    }

    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    public void setCardExpiryYear(String cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
    }

    public String getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
    }
}
