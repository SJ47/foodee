import React, { useState } from "react";
import {
    Elements,
    CardElement,
    useStripe,
    useElements,
} from "@stripe/react-stripe-js";
import { loadStripe } from "@stripe/stripe-js";
import "../css/StripeCardElement.css";


const StripeCardElement = () => {
    const stripe = loadStripe(
        "pk_test_51IdLMSBwKf7xu8WG2kbdOVY0WB59fU3R4X1YW0X1J8nwsUCK8NTtDAIPCVhikaHYtjsqSE1hqoRHwkOYAcjqe7l900L04zlOMS"
    );
    return (
        <Elements stripe={stripe}>
            <CheckoutForm />
        </Elements>
    );
};
function CheckoutForm() {
    const [isPaymentLoading, setPaymentLoading] = useState(false);
    const stripe = useStripe();
    const elements = useElements();
    const payMoney = async (e) => {
        e.preventDefault();
        if (!stripe || !elements) {
            return;
        }
        setPaymentLoading(true);
        // const clientSecret = getClientSecret();
        const clientSecret = "sk_test_51IdLMSBwKf7xu8WGg9KnSVvY9pUBTP329F2Z6WNpj8cilmwiBqG8QotstMuYq238dTUiZl1c9X7JT3zJSTrE5N3S00Y60x6akt"
        const paymentResult = await stripe.confirmCardPayment(clientSecret, {
            payment_method: {
                card: elements.getElement(CardElement),
                billing_details: {
                    name: "Alan Partridge",
                },
            },
        });
        setPaymentLoading(false);
        if (paymentResult.error) {
            alert(paymentResult.error.message);
        } else {
            if (paymentResult.paymentIntent.status === "succeeded") {
                alert("Success!");
            }
        }
    };

    return (
        <div
            style={{
                padding: "3rem",
            }}
        >
            <div
                style={{
                    maxWidth: "500px",
                    margin: "0 auto",
                }}
            >
                <form
                    style={{
                        display: "block",
                        width: "100%",
                    }}
                    onSubmit={payMoney}
                >
                    <div
                        style={{
                            display: "flex",
                            flexDirection: "column",
                            alignItems: "center",
                        }}
                    >
                        <CardElement
                            className="card"
                            options={{
                                style: {
                                    base: {
                                        backgroundColor: "white"
                                    }
                                },
                            }}
                        />
                        <button
                            className="pay-button"
                            disabled={isPaymentLoading}
                        >
                            {isPaymentLoading ? "Loading..." : "Pay"}
                        </button>
                    </div>
                </form>
            </div>
        </div>
    );
}

export default StripeCardElement