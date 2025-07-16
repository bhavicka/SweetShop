package com.example.sweetshop.sweets;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SweetRepository extends JpaRepository<Sweet, Integer> {
    void deleteBySweetName(String sweetName);
}
