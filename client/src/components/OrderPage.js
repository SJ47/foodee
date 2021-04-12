import React from "react";
import '../css/OrderPage.css';
import OrderForm from "./OrderForm";




const OrderPage = ({ customer, basket, basketValue }) => {

    let orderTotal = 0;
    const orderList = basket.map((item, index) => {
        orderTotal = orderTotal + (item.price * item.quantity)
        return <li key={index}>{item.name} - Item Price: £{item.price} - Qty: {item.quantity}</li>
    })

    return (

        <div className="order-page">

            <h2> Summary of your order </h2>
            <ul>{orderList}</ul>
            <h2>Total: £{orderTotal}</h2>
            

            <OrderForm customer={customer}
                basket={basket}
                basketValue={basketValue} />
    
        </div>
    )
}

export default OrderPage;
