package com.storeware.operation;

import com.storeware.operations.Addition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    private final Addition addition = Addition.getInstance();

    @Test
    public void shouldReturnSameObjectInstance() {
        //given
        Addition objectReference = Addition.getInstance();
        //then
        Assertions.assertSame(objectReference, addition);
    }

    @Test
    public void shouldReturnResultAfterAddedTwoNumbers() {
        //given
        int previousNumber = 10;
        int nextNumber = 12;
        //when
        int expectedValue = 22;
        int returnValue = addition.doSimpleCalculation(previousNumber, nextNumber);
        //then
        Assertions.assertEquals(expectedValue, returnValue);
    }
}
