package com.ialcoholic.foodees.foodee_service.repositories.people;

import com.ialcoholic.foodees.foodee_service.models.people.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
