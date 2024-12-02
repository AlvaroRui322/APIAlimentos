package com.example.apialimentos.entities;

import jakarta.persistence.*;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import java.time.LocalDate;

@Entity
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private boolean perishable;
    private LocalDate expirationDate;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private StorageLocation location;
}
