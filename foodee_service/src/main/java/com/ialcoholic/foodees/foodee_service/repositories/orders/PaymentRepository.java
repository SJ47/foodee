package com.ialcoholic.foodees.foodee_service.repositories.orders;


import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.ialcoholic.foodees.foodee_service.models.orders.Payment;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.data.jpa.repository.JpaRepository;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.stereotype.Repository;

import static spark.Spark.port;
//import static spark.Spark.staticFiles;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    default CreatePaymentResponse processStripePaymentIntent(Double payment) throws StripeException {
        Gson gson = new Gson();
        port(4242);
//        System.out.println("Payment amount: " + payment);

//        staticFiles.externalLocation(Paths.get("").toAbsolutePath().toString());

//        System.out.println("Processing stripe paymentRepository...");

        Dotenv dotenv = Dotenv.load();
        final String STRIPE_SECRET=dotenv.get("STRIPE_SECRET");

        String clientSecret;
        Stripe.apiKey = STRIPE_SECRET;

//        CreatePayment postBody = gson.fromJson(String.valueOf(payment), CreatePayment.class);

        PaymentIntentCreateParams createParams = new PaymentIntentCreateParams.Builder()
                .setCurrency("gbp")
                .setAmount((long) (payment*100))
                .build();

        PaymentIntent intent = PaymentIntent.create(createParams);
        CreatePaymentResponse paymentResponse = new CreatePaymentResponse(intent.getClientSecret());
//        System.out.println("Payment response: " + paymentResponse.clientSecret);

        return paymentResponse;

    }

    //
//    static Gson gson = new Gson();

    class CreatePayment {
        @SerializedName("items")
        Object[] items;

        public Object[] getItems() {
            return items;
        }
    }

    static class CreatePaymentResponse {
        private String clientSecret;

        public CreatePaymentResponse(String clientSecret) {
            this.clientSecret = clientSecret;
        }
    }

    static int calculateOrderAmount(Object[] items) {
        // Replace this constant with a calculation of the order's amount
        // Calculate the order total on the server to prevent
        // users from directly manipulating the amount on the client
        return 1400;
    }


}