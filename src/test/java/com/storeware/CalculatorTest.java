package com.storeware;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

public class CalculatorTest {

    private Calculator calculator;

    @Test
    public void shouldInitializeCollectionOfOperationIfProvideValidString() {
        //given
        String validString = """
                add 2
                multiply 3
                apply 10
                """;
        calculator = new Calculator(validString);
        //when
        ArrayDeque<String> resultCollection = calculator.getOperationCommands();
        //then
        Assertions.assertFalse(resultCollection.isEmpty());
    }

    @Test
    public void shouldInitializeEmptyCollectionOfOperationIfProvideStringIsNonValid() {
        //given
        String invalidString = "";
        calculator = new Calculator(invalidString);
        //when
        ArrayDeque<String> resultCollection = calculator.getOperationCommands();
        //then
        Assertions.assertTrue(resultCollection.isEmpty());
    }

    @Test
    public void shouldReturnResultOfNumbersAndOperator() {
        //given
        int numberToCalculation = 16;
        String additionContent = "add 4";
        String applyingContent = "apply 8";
        String divisionContent = "divide 4";
        String powerContent = "power 2";
        String multiplicationContent = "multiply 2";
        String moduloContent = "modulo 5";
        String subtractionContent = "subtract 6";
        calculator = new Calculator("");
        //when
        int expectedAddition = 20;
        int expectedApplying = 8;
        int expectedDivision = 4;
        int expectedPower = 256;
        int expectedMultiplication = 32;
        int expectedModulo = 1;
        int expectedSubtraction = 10;

        int resultAddition = calculator.makeSingleOperation(numberToCalculation, additionContent);
        int resultApplying = calculator.makeSingleOperation(numberToCalculation, applyingContent);
        int resultDivision = calculator.makeSingleOperation(numberToCalculation, divisionContent);
        int resultPower = calculator.makeSingleOperation(numberToCalculation, powerContent);
        int resultMultiplication = calculator.makeSingleOperation(numberToCalculation, multiplicationContent);
        int resultModulo = calculator.makeSingleOperation(numberToCalculation, moduloContent);
        int resultSubtraction = calculator.makeSingleOperation(numberToCalculation, subtractionContent);
        //then
        Assertions.assertEquals(expectedAddition, resultAddition);
        Assertions.assertEquals(expectedApplying, resultApplying);
        Assertions.assertEquals(expectedDivision, resultDivision);
        Assertions.assertEquals(expectedPower, resultPower);
        Assertions.assertEquals(expectedMultiplication, resultMultiplication);
        Assertions.assertEquals(expectedModulo, resultModulo);
        Assertions.assertEquals(expectedSubtraction, resultSubtraction);
    }

    @Test
    public void shouldThrowExceptionIfArgumentIsNonValid() {
        //given
        String nonValidOperationContent = "multiply5";
        String validOperationContent = "multiply 5";
        Integer nonValidNumberToCalculate = null;
        int validNumberToCalculate = 5;
        //when
        calculator = new Calculator("");
        //then
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.makeSingleOperation(validNumberToCalculate, nonValidOperationContent));
        Assertions.assertThrows(NullPointerException.class,
                () -> calculator.makeSingleOperation(nonValidNumberToCalculate, validOperationContent));
    }
}
