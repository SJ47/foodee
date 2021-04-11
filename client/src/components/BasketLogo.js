import React from 'react';
import '../css/TopNavBar.css'
import BasketYellow from '../media/CartEmptyYellow.png'

const BasketLogo = () => {
    return (
        <img id="basket-logo" className="grow" src={BasketYellow} alt="basket logo"/>
    )
    };
    
    export default BasketLogo;