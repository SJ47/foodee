import React from "react";
import '../css/OrderPage.css';
import OrderForm from "./OrderForm";


const OrderPage = ({customer, basket, basketValue}) => {
    return (

        <>

        <p>Hello OrderPage </p>

        <OrderForm customer={customer} 
        basket={basket}
        basketValue={basketValue}/>
        </>

        
    )
}

export default OrderPage;
