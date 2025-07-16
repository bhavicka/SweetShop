package com.example.sweetshop.sweets;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Sweet {
    @GeneratedValue
    @Id
    Integer id;
    String sweetName;
    String category;
    Double price;
    Integer quantity;
}
