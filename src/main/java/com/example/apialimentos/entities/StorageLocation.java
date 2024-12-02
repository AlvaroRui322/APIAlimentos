package com.example.apialimentos.entities;

import jakarta.persistence.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@Entity
public class StorageLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<FoodItem> foodItems;

}
