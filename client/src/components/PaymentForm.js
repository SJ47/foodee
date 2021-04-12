import React, { useState } from 'react'
import Request from '../helpers/request';
import "../css/PaymentForm.css"

const PaymentForm = ({ basket, basketValue }) => {

    const [cardDetails, setCardDetails] = useState(
        {
            cardHolder: "",
            cardNumber: "4242424242424242",
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
        return <tr key={index}><td> {item.name}</td> <td>£{item.price}</td> <td>{item.quantity}</td></tr>
    })

    return (
        <div className="payment-form-container">
            <div className="order-form-summary">
                <h1>Order Summary for Payment</h1>
                <table className="order-table">
                    <tr>
                        <th>Order Item</th>
                        <th>Price</th>
                        <th>Qty</th>
                    </tr>
                    {orderList}

                </table>
                {/* <table>{orderList}</table> */}
                <h2>Total: £{orderTotal}</h2>
            </div>

            <form className="payment-form" onSubmit={handleSubmitPayment}>
                <h3> Enter Card Details</h3>
                <input type="text" placeholder="Card Holder Name" name="cardHolder" onChange={handleChange} value={cardDetails.CardHolder} required />
                <input type="text" placeholder="Card Number" name="cardNumber" onChange={handleChange} value={cardDetails.cardNumber} required />
                <input type="text" placeholder="Expiry Month" name="cardExpiryMonth" onChange={handleChange} value={cardDetails.cardExpiryMonth} required />
                <input type="text" placeholder="Expiry Year" name="cardExpiryYear" onChange={handleChange} value={cardDetails.cardExpiryYear} required />
                <input type="text" placeholder="CVV" name="cardCvv" onChange={handleChange} value={cardDetails.cardCvv} required />
                <button type="submit">PAY NOW </button>
            </form>
        </div>
    )
}

export default PaymentForm
