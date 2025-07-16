package com.example.sweetshop.sweets;

import lombok.AllArgsConstructor;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SweetService {
    private final SweetRepository sweetRepository;

    public Sweet save(Sweet sweet){
        return sweetRepository.save(sweet);
    }
}
