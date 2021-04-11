package com.ialcoholic.foodees.foodee_service;

import com.stripe.Stripe;
import com.stripe.model.Charge;
import com.stripe.model.Token;
import io.github.cdimascio.dotenv.Dotenv;
import com.stripe.param.CustomerRetrieveParams;
import com.stripe.model.Customer;
import com.stripe.model.Card;
import com.stripe.exception.StripeException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class FoodeeServiceApplication {

	public static void main(String[] args) throws StripeException {
		SpringApplication.run(FoodeeServiceApplication.class, args);

		Dotenv dotenv = Dotenv.load();
		final String STRIPE_SECRET=dotenv.get("STRIPE_SECRET");

		Stripe.apiKey = STRIPE_SECRET;

//    How to charge a non stripe customer in stripe using a token meaning not using a card stored in their account, so taking card details each time
		Map<String, Object> cardParam = new HashMap<String, Object>();
		cardParam.put("number", "4242424242424242");
		cardParam.put("exp_month", "01");
		cardParam.put("exp_year", "2024");
		cardParam.put("cvc", "123");

		// Get token *** Note you can only use a token once.  used for one time only payment??  If you get customer ID, then it gets payment on file?
		Map <String, Object> tokenParam = new HashMap<String, Object>();
		tokenParam.put("card", cardParam);
		Token token = Token.create(tokenParam);
		Map <String, Object> source = new HashMap<String, Object>();

		// Now make the charge
		Map<String, Object> chargeParam = new HashMap<String, Object>();
		chargeParam.put("amount", "1099");  // Remember price in lowest denomination (so 1p or 1c for example, so multiply by 100)
		chargeParam.put("currency", "gbp");
		chargeParam.put("source", token.getId());  // will use Token for one time payment instead of customer card stored on file
//		Charge.create(chargeParam);
	}
}
