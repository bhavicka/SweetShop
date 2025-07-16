package com.example.sweetshop.sweets;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/search/name/{sweetname}")
    public Sweet searchBySweetName(@PathVariable("sweetname") String sweetname){
        return sweetService.searchBySweetName(sweetname);
    }

    @GetMapping("/search/category/{cat}")
    public List<Sweet> searchByCategory(@PathVariable("cat") String category){
        return sweetService.searchByCategory(category);
    }

    @GetMapping("/search/range/{min}/{max}")
    public List<Sweet> searchByPriceRange(
            @PathVariable("min") Double min,
            @PathVariable("max") Double max) {
        return sweetService.searchByPriceRange(min, max);
    }
}
