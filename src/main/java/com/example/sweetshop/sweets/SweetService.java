package com.example.sweetshop.sweets;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SweetService {
    private final SweetRepository sweetRepository;

    public Sweet save(Sweet sweet){
        return sweetRepository.save(sweet);
    }

    public void deleteBySweetName(String sweetName){
        sweetRepository.deleteBySweetName(sweetName);
    }

    public Sweet searchBySweetName(String sweetname){
        return sweetRepository.findBySweetName(sweetname);
    }

    public List<Sweet> searchByCategory(String category){
        return sweetRepository.findByCategory(category);
    }

    public List<Sweet> searchByPriceRange(Double min, Double max){
        return sweetRepository.findByPriceBetween(min, max);
    }
}
