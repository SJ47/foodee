import React from "react";
import '../css/OrderPage.css';
import OrderForm from "./OrderForm";




const OrderPage = ({customer, basket, basketValue}) => {
    return (

        <div className ="order-page">

        <p>Hello OrderPage </p>

        <OrderForm customer={customer} 
        basket={basket}
        basketValue={basketValue}/>
            <div className="order-text">TOTAL</div>
            <div className="order-total">£{basketValue}</div>
        </div>

        
    )
}

export default OrderPage;
