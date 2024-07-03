package com.example.demo.Classes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExceptionTest {

    @Test
    void convertStringToInteger_nullInput() {
        assertThrows(IllegalArgumentException.class, () -> Exception.convertStringToInteger(null));
    }

    @Test
    void convertStringToInteger_emptyString() {
        assertThrows(IllegalArgumentException.class, () -> Exception.convertStringToInteger(""));
    }

    // Uncomment if the method is intended to convert valid strings to integers
     @Test
     void convertStringToInteger_validInteger() {
         Exception.convertStringToInteger("123"); // No assertion needed (void method)
     }
}
