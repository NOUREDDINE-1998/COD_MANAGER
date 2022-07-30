package com.example.CODManager.repositories;

import com.example.CODManager.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {
}
