import React, { useState } from 'react'
import Request from '../helpers/request';

const PaymentForm = ({ basket, basketValue }) => {

    const [cardDetails, setCardDetails] = useState(
        {
            cardHolder: "",
            cardNumber: "",
            cardExpiryMonth: "",
            cardExpiryYear: "",
            cardCvv: ""
        }
    )

    // Handle payment
    const handlePaymentPost = (payment) => {
        payment.totalPayment = basketValue;
        const request = new Request();
        request.post("/payments", payment)
        // .then(() => window.location = '/home')
        // change '/' to whichever route the home page is called
    }


    const handleChange = (event) => {
        let propertyName = event.target.name;
        let copiedCardDetails = { ...cardDetails }
        copiedCardDetails[propertyName] = event.target.value;

        setCardDetails(copiedCardDetails)
    }

    const handleSubmitPayment = (event) => {
        event.preventDefault();
        handlePaymentPost(cardDetails)
    }

    let orderTotal = 0;
    const orderList = basket.map((item, index) => {
        orderTotal = orderTotal + (item.price * item.quantity)
        return <li key={index}>{item.name} - Item Price: £{item.price} - Qty: {item.quantity}</li>
    })

    return (
        <div>
            Hello from Payment component
            <h1>Order Summary for Payment</h1>
            <ul>{orderList}</ul>
            <h2>Total: £{orderTotal}</h2>

            <form className="payment-form" onSubmit={handleSubmitPayment}>
                <input type="text" placeholder="Card Holder Name" name="cardHolder" onChange={handleChange} value={cardDetails.CardHolder} />
                <input type="text" placeholder="Card Number" name="cardNumber" onChange={handleChange} value={cardDetails.cardNumber} />
                <input type="text" placeholder="Expiry Month" name="cardExpiryMonth" onChange={handleChange} value={cardDetails.cardExpiryMonth} />
                <input type="text" placeholder="Expiry Year" name="cardExpiryYear" onChange={handleChange} value={cardDetails.cardExpiryYear} />
                <input type="text" placeholder="CVV" name="cardCvv" onChange={handleChange} value={cardDetails.cardCvv} />
                <button type="submit">PAY NOW</button>
            </form>
        </div>
    )
}

export default PaymentForm
