package com.example.sweetshop.sweets;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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

}
