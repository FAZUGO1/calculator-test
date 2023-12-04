package com.example.calculatortest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTestApplicationTests {

     Calculator calculator = new Calculator();
    
    @Test
    void testSuma(){
        // Given
        //Calculator calculator = new Calculator();

        // When
        double result = calculator.suma(3,5);

        // then
        assertEquals(8, result);
        assertNotEquals(3, calculator.suma(4.5,6));
        
    }

    @Test
    void testResta(){
        assertEquals(4, calculator.resta(10,6));
    }

    @Test

    void testIguales(){
        assertTrue(calculator.suma(3, 4)==7);
        assertNotNull(calculator.suma(3, 4));
    }

    @ParameterizedTest

    @ValueSource(ints = { 1, 2, 3 })

    void testWithValueSource(int argument) {
        assertTrue(argument > 0 && argument < 4);
    }
}
