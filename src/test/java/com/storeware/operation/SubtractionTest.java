package com.storeware.operation;

import com.storeware.operations.Subtraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractionTest {

    private final Subtraction subtraction = Subtraction.getInstance();

    @Test
    public void shouldReturnSameObjectInstance() {
        //given
        Subtraction objectReference = Subtraction.getInstance();
        //then
        Assertions.assertSame(objectReference, subtraction);
    }

    @Test
    public void shouldReturnResultAfterSubtractionTwoNumbers() {
        //given
        int previousNumber = 5;
        int nextNumber = 2;
        //when
        int expectedValue = 3;
        int returnValue = subtraction.doSimpleCalculation(previousNumber, nextNumber);
        //then
        Assertions.assertEquals(expectedValue, returnValue);
    }
}
