package com.ialcoholic.foodees.foodee_service.controllers.orders;

import com.ialcoholic.foodees.foodee_service.models.orders.Payment;
import com.ialcoholic.foodees.foodee_service.repositories.orders.PaymentRepository;
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

    @GetMapping(value="/payments/{id}")
    public ResponseEntity getPayment(@PathVariable Long id){
        return new ResponseEntity<>(paymentRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/payments")
    public ResponseEntity<Payment> postPayment(@RequestBody Payment payment){
        paymentRepository.save(payment);
        System.out.println("Payment Details: " + payment);
        return new ResponseEntity<>(payment, HttpStatus.CREATED);
    }
}
