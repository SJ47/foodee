package com.ialcoholic.foodees.foodee_service.repositories.people;

import com.ialcoholic.foodees.foodee_service.models.people.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
