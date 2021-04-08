package com.ialcoholic.foodees.foodee_service.repositories.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.SoftDrink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftDrinkRepository extends JpaRepository<SoftDrink, Long> {

}
