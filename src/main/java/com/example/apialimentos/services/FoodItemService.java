package com.example.apialimentos.services;

import com.example.apialimentos.entities.FoodItem;
import com.example.apialimentos.repositories.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    private FoodItemRepository repository;

    public List<FoodItem> getAllItems() {
        return repository.findAll();
    }

    public FoodItem saveItem(FoodItem item) {
        return repository.save(item);
    }

    public void deleteItem(Long id) {
        repository.deleteById(id);
    }

    public List<FoodItem> getItemsExpiringSoon() {
        return repository.findByExpirationDateBefore(LocalDate.now().plusDays(3));
    }
}


