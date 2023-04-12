package com.storeware.operation;

import com.storeware.operations.Division;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    private final Division division = Division.getInstance();

    @Test
    public void shouldReturnSameObjectInstance() {
        //given
        Division objectReference = Division.getInstance();
        //then
        Assertions.assertSame(objectReference, division);
    }

    @Test
    public void shouldReturnResultAfterDivisionTwoNumbers() {
        //given
        int previousNumber = 30;
        int nextNumber = 10;
        //when
        int expectedValue = 3;
        int returnValue = division.doSimpleCalculation(previousNumber, nextNumber);
        //then
        Assertions.assertEquals(expectedValue, returnValue);
    }
}
