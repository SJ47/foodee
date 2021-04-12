import React from 'react'
import { Elements } from '@stripe/react-stripe-js';
import { loadStripe } from '@stripe/stripe-js';

const stripePromise = loadStripe('pk_test_51IdLMSBwKf7xu8WG2kbdOVY0WB59fU3R4X1YW0X1J8nwsUCK8NTtDAIPCVhikaHYtjsqSE1hqoRHwkOYAcjqe7l900L04zlOMS');

const StripeCardElement = () => {
    return (
        <Elements stripe={stripePromise}>
            <MyCheckoutForm />
        </Elements>
    )
}

export default StripeCardElement

