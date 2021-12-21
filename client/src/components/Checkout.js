import React from 'react'
import { Link } from "react-router-dom"
import '../css/Checkout.css';
import BasketYellow from '../media/CartEmptyYellow.png'


const Checkout = ({ basketCounter, basketValue }) => {
    return (
        <div className="checkout-container">
            <div className="checkout-total">£{basketValue.toFixed(2)}</div>
            <div id="button-basket">
                <img id="basket-logo-checkout" src={BasketYellow} alt="basket logo" />
                <div className="basket-item-count">{basketCounter}</div>
                <Link to="/order">
                    <button id="checkout-button">CHECKOUT</button>
                </Link>
            </div>
        </div>
    )
}

export default Checkout