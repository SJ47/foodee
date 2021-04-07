package com.ialcoholic.foodees.foodee_service.repositories.orders;

import com.ialcoholic.foodees.foodee_service.models.orders.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
