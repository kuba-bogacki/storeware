package com.storeware;

import com.storeware.type.OperationType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathOperationTest {

    @Test
    public void shouldCreateInstanceOfObjectIfOperationTypeProvided() {
        //given
        OperationType operationType = OperationType.SUBTRACT;
        //when
        MathOperation createdObject = MathOperation.createMathOperation(operationType);
        //then
        Assertions.assertEquals(createdObject.getOperationType(), operationType);
    }

    @Test
    public void shouldChooseCorrectCalculationByUsingOperationTypeOfThisObjectAndMakeCalculation() {
        //given
        int previousNumber = 15;
        int nextNumber = 5;
        MathOperation multiplicationObject = MathOperation.createMathOperation(OperationType.MULTIPLY);
        MathOperation subtractionObject = MathOperation.createMathOperation(OperationType.SUBTRACT);
        MathOperation additionObject = MathOperation.createMathOperation(OperationType.ADD);
        //when
        int expectedMultiplicationResult = 75;
        int expectedSubtractionResult = 10;
        int expectedAdditionResult = 20;
        int returnMultiplicationResult = multiplicationObject.calculateUsingOperationType(previousNumber, nextNumber);
        int returnSubtractionResult = subtractionObject.calculateUsingOperationType(previousNumber, nextNumber);
        int returnAdditionResult = additionObject.calculateUsingOperationType(previousNumber, nextNumber);
        //then
        Assertions.assertEquals(expectedMultiplicationResult, returnMultiplicationResult);
        Assertions.assertEquals(expectedSubtractionResult, returnSubtractionResult);
        Assertions.assertEquals(expectedAdditionResult, returnAdditionResult);
    }
}
