package com.example.sweetshop.sweets;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SweetServiceTest {
    @Mock
    private SweetRepository sweetRepository;

    @InjectMocks
    private SweetService sweetService;

    public SweetServiceTest(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddSweet(){
        Sweet sweet = new Sweet(1, "Kaju katli", "Dry fruits", 1000.0, 100);

        Sweet savedSweet = new Sweet(1, "Kaju katli", "Dry fruits", 1000.0, 100);

        when(sweetRepository.save(sweet)).thenReturn(savedSweet);
        Sweet res = sweetService.save(sweet);

        assertNotNull(res.getId());
        assertEquals("Kaju katli", res.getSweetName());
        assertEquals(1000.0, res.getPrice());

        verify(sweetRepository, times(1)).save(sweet);
    }

    @Test
    void testDeleteSweet(){
        String sweetname = "Kaju katli";
        sweetService.deleteBySweetName(sweetname);
        verify(sweetRepository, times(1)).deleteBySweetName(sweetname);
    }

//    @Test
//    void testSearchBySweetName() {
//        String name = "Kaju Katli";
//        Sweet sweet = new Sweet(1, "Kaju Katli", "Dry fruits", 1000.0, 100);
//
//        when(sweetRepository.findBySweetName(name)).thenReturn(sweet);
//
//        Sweet res = sweetService.searchBySweetName(name);
//
//        System.out.println(res);
//        assertNotNull(res);
//        assertEquals(name, res.getSweetName());
//
//        verify(sweetRepository, times(1)).findBySweetName(name);
//    }
}
