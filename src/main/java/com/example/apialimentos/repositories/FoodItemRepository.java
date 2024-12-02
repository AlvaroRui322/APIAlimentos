package com.example.apialimentos.repositories;

import com.example.apialimentos.entities.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    List<FoodItem> findByExpirationDateBefore(LocalDate date);
}
