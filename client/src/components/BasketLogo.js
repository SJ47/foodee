import React from 'react';
import '../css/TopNavBar.css'
import BasketYellow from '../media/CartEmptyYellow.png'

const BasketLogo = ({ basketCounter }) => {
    return (
        <>
            <img id="basket-logo" src={BasketYellow} alt="basket logo" />
            <div className="basket-item-count-top">{basketCounter}</div>
        </>
    )
};

export default BasketLogo;