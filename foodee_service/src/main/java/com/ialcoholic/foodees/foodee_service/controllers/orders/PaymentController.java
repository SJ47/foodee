package com.ialcoholic.foodees.foodee_service.controllers.orders;

import com.google.gson.Gson;
import com.ialcoholic.foodees.foodee_service.models.orders.Payment;
import com.ialcoholic.foodees.foodee_service.repositories.orders.PaymentRepository;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    PaymentRepository paymentRepository;

    @GetMapping(value="/payments")
    public ResponseEntity<List<Payment>> getAllPayments(){
        return new ResponseEntity<>(paymentRepository.findAll(), HttpStatus.OK);
    }

//    @GetMapping(value="/payments/{id}")
//    public ResponseEntity getPayment(@PathVariable Long id){
//        return new ResponseEntity<>(paymentRepository.findById(id), HttpStatus.OK);
//    }

    @PostMapping(value = "/payments")
    public ResponseEntity<Payment> postPayment(@RequestBody Payment payment) {
        paymentRepository.save(payment);
        System.out.println("payment to save is: " + payment.getTotalPayment());
        return new ResponseEntity<>(payment, HttpStatus.CREATED);
    }

    @PostMapping(value="/create-payment-intent")
    public ResponseEntity<Payment> postPayment(@RequestBody Double payment) throws StripeException {
        System.out.println("totalPayment: " + payment);

        PaymentRepository.CreatePaymentResponse paymentResponse = paymentRepository.processStripePaymentIntent(payment);
        Gson gson = new Gson();
        return new ResponseEntity(gson.toJson(paymentResponse), HttpStatus.OK);
    }

}
