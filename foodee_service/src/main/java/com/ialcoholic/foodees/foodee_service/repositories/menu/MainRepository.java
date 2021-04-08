package com.ialcoholic.foodees.foodee_service.repositories.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.Main;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends JpaRepository<Main, Long> {

}
