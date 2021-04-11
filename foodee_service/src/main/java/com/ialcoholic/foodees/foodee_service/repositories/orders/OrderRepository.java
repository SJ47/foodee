package com.ialcoholic.foodees.foodee_service.repositories.orders;

import com.ialcoholic.foodees.foodee_service.models.orders.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Repository;
import java.util.Map;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
