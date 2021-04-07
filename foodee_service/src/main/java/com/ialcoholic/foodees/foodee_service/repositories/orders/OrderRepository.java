package com.ialcoholic.foodees.foodee_service.repositories.orders;

import com.ialcoholic.foodees.foodee_service.models.orders.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
