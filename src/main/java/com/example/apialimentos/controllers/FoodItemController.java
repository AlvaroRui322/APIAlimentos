package com.example.apialimentos.controllers;


import com.example.apialimentos.entities.FoodItem;
import com.example.apialimentos.services.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food-items")
public class FoodItemController {

    @Autowired
    private FoodItemService service;

    @GetMapping
    public List<FoodItem> getAllItems() {
        return service.getAllItems();
    }

    @PostMapping
    public FoodItem addItem(@RequestBody FoodItem item) {
        return service.saveItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        service.deleteItem(id);
    }

    @GetMapping("/expiring-soon")
    public List<FoodItem> getExpiringSoon() {
        return service.getItemsExpiringSoon();
    }
}
