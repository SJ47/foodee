import React from 'react'

const Checkout = ({ basket, basketValue }) => {
    return (
        <div className="checkout-container">
            <i className="fas fa-shopping-cart"></i>
            <div className="item-count">{basket.length}</div>  Checkout   £{basketValue}


        </div>
    )
}

export default Checkout