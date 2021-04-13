package com.ialcoholic.foodees.foodee_service.repositories.menu;

import com.ialcoholic.foodees.foodee_service.models.menu.Category;
import com.ialcoholic.foodees.foodee_service.models.menu.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findByName(String name);

    List<MenuItem> findByCategory(String category);

    List<MenuItem> findAllByCategory(Category category);

    List<MenuItem> findByIsVegetarianTrue();

    @Query(
        value = "SELECT * FROM MENU_ITEMS WHERE vegetarian=TRUE",
        nativeQuery = true)
    List<MenuItem> findAllVegetariansNative();

    List<MenuItem> findByIsVeganTrue();

    List<MenuItem> findAllMenuItemsByCategoryAndIsVegetarianTrue(Category category);

    List<MenuItem> findAllMenuItemsByCategoryAndIsVeganTrue(Category category);

}
