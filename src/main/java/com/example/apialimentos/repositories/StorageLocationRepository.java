package com.example.apialimentos.repositories;

import com.example.apialimentos.entities.StorageLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageLocationRepository extends JpaRepository<StorageLocation, Long> {
}
