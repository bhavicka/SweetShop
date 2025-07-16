package com.example.sweetshop.sweets;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("sweets")
public class SweetController {
    private final SweetService sweetService;

    @PostMapping("/add")
    public ResponseEntity<Sweet> save(@RequestBody Sweet sweet) {
        return ResponseEntity.ok(sweetService.save(sweet));
    }

    @Transactional
    @DeleteMapping("/delete/{sweetname}")
    public void deleteBySweetName(@PathVariable("sweetname") String sweetname) {
        sweetService.deleteBySweetName(sweetname);
    }
}
