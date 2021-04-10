import React from 'react'
import '../css/Checkout.css';

const Checkout = ({ basket, basketValue }) => {

    // If basket not empty, then get the number of items in basket including their quantities
    let qtyInBasket = 0;

    if (basket.length > 0) {
        const itemsInBasket = basket.map((item) => {
            return item.quantity;
        })

        const reducer = (accumulator, currentValue) => accumulator + currentValue;
        qtyInBasket = itemsInBasket.reduce(reducer);
    }

    return (
        <div className="checkout-container">
            <i className="fas fa-shopping-cart"></i>
            <div className="basket-item-count">{qtyInBasket}</div>
            <div className="checkout-text">CHECKOUT</div>
            <div className="checkout-total">£{basketValue}</div>
        </div>

    )
}

export default Checkout