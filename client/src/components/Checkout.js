import React from 'react'
import { Link } from "react-router-dom"
import '../css/Checkout.css';


const Checkout = ({ basketCounter, basket, basketValue, handlePayment }) => {

    // If basket not empty, then get the number of items in basket including their quantities
    let qtyInBasket = 0;

    if (basket.length > 0) {
        const itemsInBasket = basket.map((item) => {
            return item.quantity;
        })

        const reducer = (accumulator, currentValue) => accumulator + currentValue;
        qtyInBasket = itemsInBasket.reduce(reducer);
    }
    console.log("Basket contents", basket)

    return (
        <>
        
            <Link to="/order">
            <div className="checkout-container">
                {/* <img id="basket-logo-checkout" src={BasketYellow} alt="basket logo" /> */}
                {/* <div className="basket-item-count">{qtyInBasket}</div> */}
            
            <div className="checkout-total">£{basketValue}</div>
            <button id="checkout-button">CHECKOUT</button>
            </div>
            </Link>
        
            {/* <div className="checkout-container">
                <Link to="/order">
                    <img id="basket-logo-checkout" src={BasketYellow} alt="basket logo" />
                    <div className="basket-item-count">{qtyInBasket}</div>
                    <div className="basket-item-count">{basketCounter}</div>
                </Link>
                <div className="checkout-total">£{basketValue}</div>
            </div> */}



        </>

    )
}

export default Checkout