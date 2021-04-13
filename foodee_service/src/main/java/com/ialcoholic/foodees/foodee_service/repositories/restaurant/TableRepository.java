package com.ialcoholic.foodees.foodee_service.repositories.restaurant;

import com.ialcoholic.foodees.foodee_service.models.restaurant.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Table, Long> {

}
