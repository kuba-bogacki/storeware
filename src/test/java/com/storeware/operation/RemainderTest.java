package com.storeware.operation;

import com.storeware.operations.Remainder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemainderTest {

    private final Remainder remainder = Remainder.getInstance();

    @Test
    public void shouldReturnSameObjectInstance() {
        //given
        Remainder objectReference = Remainder.getInstance();
        //then
        Assertions.assertSame(objectReference, remainder);
    }

    @Test
    public void shouldReturnResultAfterModuloTwoNumbers() {
        //given
        int previousNumber = 5;
        int nextNumber = 2;
        //when
        int expectedValue = 1;
        int returnValue = remainder.doSimpleCalculation(previousNumber, nextNumber);
        //then
        Assertions.assertEquals(expectedValue, returnValue);
    }
}
