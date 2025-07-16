package com.example.sweetshop.sweets;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("sweets")
public class SweetController {
    private final SweetService sweetService;

    @PostMapping("/add")
    public ResponseEntity<Sweet> save(Sweet sweet){
        return ResponseEntity.ok(sweetService.save(sweet));
    }

}
