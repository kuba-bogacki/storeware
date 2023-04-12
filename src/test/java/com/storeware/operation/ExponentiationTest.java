package com.storeware.operation;

import com.storeware.operations.Exponentiation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExponentiationTest {

    private final Exponentiation exponentiation = Exponentiation.getInstance();

    @Test
    public void shouldReturnSameObjectInstance() {
        //given
        Exponentiation objectReference = Exponentiation.getInstance();
        //then
        Assertions.assertSame(objectReference, exponentiation);
    }

    @Test
    public void shouldReturnResultAfterExponentiationTwoNumbers() {
        //given
        int previousNumber = 4;
        int nextNumber = 2;
        //when
        int expectedValue = 16;
        int returnValue = exponentiation.doSimpleCalculation(previousNumber, nextNumber);
        //then
        Assertions.assertEquals(expectedValue, returnValue);
    }
}
