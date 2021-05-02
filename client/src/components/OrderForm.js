import React, { useState } from 'react';
import '../css/OrderForm.css';
import '../css/LoginPage.css'
import { Link } from "react-router-dom"


const OrderForm = ({ customer, basket, basketValue, handleOrderPost }) => {

    // const totalValue = basket.map((item) => {
    //     let total = 0;
    //     return total += item.price
    // })

    const [stateOrder, setStateOrder] = useState(
        {
            customer: customer,
            specialNotes: "",
            total: basketValue,
            quantity: basket.length,
            orderItems: basket
        }
    )

    const handleChange = function (event) {
        let propertyName = event.target.name;
        let copiedOrder = { ...stateOrder }
        copiedOrder[propertyName] = event.target.value;
        copiedOrder[customer] = customer;
        setStateOrder(copiedOrder)
    }

    const handleSubmit = function (event) {
        // console.log("handleSubmit called")
        event.preventDefault();
        handleOrderPost(stateOrder);
    }

    return (
        <div className="order-form">
            <form onSubmit={handleSubmit}>
                <textarea className="large-text" placeholder="Special notes..." name="specialNotes" onChange={handleChange} value={stateOrder.specialNotes} />
                {/* <input className="large-text" type="textarea" placeholder="Special notes..." name="specialNotes" onChange={handleChange} value={stateOrder.specialNotes} /> */}
                <br></br>
                <Link to="/paymentform">
                    <button className="order-btn" type="submit">SUBMIT</button>
                </Link>
            </form>
        </div>
    )
}


export default OrderForm;