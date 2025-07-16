package com.example.sweetshop.sweets;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SweetRepository extends JpaRepository<Sweet, Integer> {
    void deleteBySweetName(String sweetName);

    Sweet findBySweetName(String sweetname);

    List<Sweet> findByCategory(String category);

    List<Sweet> findByPriceBetween(Double min, Double max);
}
