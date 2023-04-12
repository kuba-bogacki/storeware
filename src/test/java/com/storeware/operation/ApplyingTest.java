package com.storeware.operation;

import com.storeware.operations.Applying;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplyingTest {

    private final Applying applying = Applying.getInstance();

    @Test
    public void shouldReturnSameObjectInstance() {
        //given
        Applying objectReference = Applying.getInstance();
        //then
        Assertions.assertSame(objectReference, applying);
    }

    @Test
    public void shouldReturnOnlySecondNumber() {
        //given
        int previousNumber = 10;
        int nextNumber = 12;
        //when
        int expectedValue = 12;
        int returnValue = applying.doSimpleCalculation(previousNumber, nextNumber);
        //then
        Assertions.assertEquals(expectedValue, returnValue);
    }
}
