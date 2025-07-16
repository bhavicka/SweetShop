package com.example.sweetshop.sweets;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
}
