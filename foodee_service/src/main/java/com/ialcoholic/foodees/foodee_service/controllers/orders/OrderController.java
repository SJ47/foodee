package com.ialcoholic.foodees.foodee_service.controllers.orders;

import com.ialcoholic.foodees.foodee_service.models.orders.Order;
import com.ialcoholic.foodees.foodee_service.repositories.orders.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping(value="/orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<>(orderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/orders/{id}")
    public ResponseEntity getOrder(@PathVariable Long id){
        return new ResponseEntity<>(orderRepository.findById(id), HttpStatus.OK);
    }
}
