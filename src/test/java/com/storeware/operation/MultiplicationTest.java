package com.storeware.operation;

import com.storeware.operations.Multiplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    private final Multiplication multiplication = Multiplication.getInstance();

    @Test
    public void shouldReturnSameObjectInstance() {
        //given
        Multiplication objectReference = Multiplication.getInstance();
        //then
        Assertions.assertSame(objectReference, multiplication);
    }

    @Test
    public void shouldReturnResultAfterMultiplicationTwoNumbers() {
        //given
        int previousNumber = 4;
        int nextNumber = 2;
        //when
        int expectedValue = 8;
        int returnValue = multiplication.doSimpleCalculation(previousNumber, nextNumber);
        //then
        Assertions.assertEquals(expectedValue, returnValue);
    }
}
