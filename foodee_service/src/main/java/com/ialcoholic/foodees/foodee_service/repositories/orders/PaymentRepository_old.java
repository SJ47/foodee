//package com.ialcoholic.foodees.foodee_service.repositories.orders;
//
//import com.ialcoholic.foodees.foodee_service.models.orders.Payment;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
////
//
//import com.stripe.Stripe;
//import com.stripe.model.Charge;
//import com.stripe.model.Token;
//import io.github.cdimascio.dotenv.Dotenv;
//import com.stripe.exception.StripeException;
//
//import java.util.HashMap;
//import java.util.Map;
//
////
//
//@Repository
//public interface PaymentRepository_old extends JpaRepository<Payment, Long> {
//
//    default PaymentRepository.CreatePaymentResponse processStripePayment(Payment payment){
//        System.out.println("Processing stripe payment...");
//
//        Dotenv dotenv = Dotenv.load();
//        final String STRIPE_SECRET=dotenv.get("STRIPE_SECRET");
//
//        Stripe.apiKey = STRIPE_SECRET;
//
//        //
//        //    How to charge a non stripe customer in stripe using a token meaning not using a card stored in their account, so taking card details each time
//        Map<String, Object> cardParam = new HashMap<String, Object>();
////        cardParam.put("number", "4242424242424242");
//        cardParam.put("number", payment.getCardNumber());
//        cardParam.put("exp_month", payment.getCardExpiryMonth());
//        cardParam.put("exp_year", payment.getCardExpiryYear());
//        cardParam.put("cvc", payment.getCardCvv());
//
//        // Get token *** Note you can only use a token once.  used for one time only payment??  If you get customer ID, then it gets payment on file?
//        Map <String, Object> tokenParam = new HashMap<String, Object>();
//        tokenParam.put("card", cardParam);
//        Token token = null;
//        try {
//            token = Token.create(tokenParam);
//        } catch (StripeException e) {
//            e.printStackTrace();
//        }
//        Map <String, Object> source = new HashMap<String, Object>();
//
//        // Now make the charge
//        Map<String, Object> chargeParam = new HashMap<String, Object>();
//
//        // Convert double * 100 to pence and convert to int then string
//        int tempTotal = (int) (payment.getTotalPayment()*100);
//        String stringTotalPayment = String.valueOf(tempTotal);
//        System.out.println("totalPayment: " + stringTotalPayment);
//
//        chargeParam.put("amount", stringTotalPayment);  // Remember price in lowest denomination (so 1p or 1c for example, so multiply by 100)
////        chargeParam.put("amount", "1999");  // Remember price in lowest denomination (so 1p or 1c for example, so multiply by 100)
//        chargeParam.put("currency", "gbp");
//        chargeParam.put("source", token.getId());  // will use Token for one time payment instead of customer card stored on file
//        try {
//            Charge.create(chargeParam);
//        } catch (StripeException e) {
//            e.printStackTrace();
//        }
//
//
//        //
//
//        return null;
//    };
//
//    PaymentRepository.CreatePaymentResponse processStripePaymentIntent(Payment payment);
//}
