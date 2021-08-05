package com.coding.acadaemy.calculator;

import com.coding.academy.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldAddIntegers(){

    // given
    Calculator calculator = new Calculator();

    // when
    int result = calculator.add(2, 3);

    //then
    assertEquals(5, result);
    }
}
