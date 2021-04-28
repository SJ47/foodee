import React, { useState, useEffect } from "react";
import {
    CardElement,
    useStripe,
    useElements

} from "@stripe/react-stripe-js";

import Request from "../helpers/request"
import "../css/PaymentForm.css"


const CheckoutForm = ({ basketValue, basket }) => {

    const [succeeded, setSucceeded] = useState(false);
    const [error, setError] = useState(null);
    const [processing, setProcessing] = useState('');
    const [disabled, setDisabled] = useState(true);
    const [clientSecret, setClientSecret] = useState('');
    const stripe = useStripe();
    const elements = useElements();

    useEffect(() => {
        // Create PaymentIntent as soon as the page loads
        const request = new Request();
        // request.post("/create-payment-intent", { items: [{ id: "xl-tshirt" }] })  // I would likely pass my basket of items here
        request.post("/create-payment-intent", basketValue)  // I would likely pass my basket of items here was basketValue before
            .then(res => {
                console.log("First promise")
                return res.json()
            })
            .then(data => {
                console.log("Second promise with clientSecret: ", data.clientSecret);
                setClientSecret(data.clientSecret)
            })
    }, []);

    const cardStyle = {
        style: {
            base: {
                color: "#32325d",
                fontFamily: 'Arial, sans-serif',
                fontSmoothing: "antialiased",
                fontSize: "16px",
                "::placeholder": {
                    color: "#32325d"
                }
            },
            invalid: {
                color: "#fa755a",
                iconColor: "#fa755a"
            },
        }
    };
    const handleChange = async (event) => {
        // Listen for changes in the CardElement
        // and display any errors as the customer types their card details
        setDisabled(event.empty);
        setError(event.error ? event.error.message : "");
    };

    const handleSubmit = async ev => {
        ev.preventDefault();
        setProcessing(true);

        const payload = await stripe.confirmCardPayment(clientSecret, {
            payment_method: {
                card: elements.getElement(CardElement)
            }
        });

        if (payload.error) {
            setError(`Payment failed ${payload.error.message}`);
            setProcessing(false);
        } else {
            setError(null);
            setProcessing(false);
            setSucceeded(true);
            // make a post to backend to say payment successful and save it?
            const request = new Request();
            request.post("/payments", { totalPayment: basketValue.toFixed(2) })  // I would likely pass my basket of items here was basketValue before
                .then(res => {
                    console.log("Payment saved")
                    return res.json()
                })
                .then(data => {
                    console.log("2nd part of payment saved");
                })
        }
    };

    // Check what basket contains
    // if (basket.length > 0) {
    //     basket.map((item) => {
    //         console.log("Item in basket: ", item);
    //     })
    // }

    return (
        <form id="payment-form" onSubmit={handleSubmit}>
            <CardElement id="card-element" options={cardStyle, { hidePostalCode: true }} onChange={handleChange} />
            {/* <CardExpiryElement id="card-element" options={cardStyle} onChange={handleChange} /> */}
            <button
                disabled={processing || disabled || succeeded}
                id="submit"
            >
                <span id="button-text">
                    {processing ? (
                        <div className="spinner" id="spinner"></div>
                    ) : (
                        "Pay now"
                    )}
                </span>
            </button>

            {/* Show any error that happens when processing the payment */}
            {error && (
                <div className="card-error" role="alert">
                    {error}
                </div>
            )}

            {/* Show a success message upon completion */}
            <p className={succeeded ? "result-message" : "result-message hidden"}>
                Payment succeeded
                <a href={`/thankyou`}>
                    {" "}
                    Continue.
                </a>
            </p>
            {/* window.location = '/thankyou'; */}
        </form>
    )
}

export default CheckoutForm
