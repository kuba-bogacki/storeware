package com.storeware;

import com.storeware.exceptions.EmptyFileException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Objects;

import static com.storeware.Main.FILE_DIRECTORY;

public class CalculationFacadeTest {

    CalculatorFacade calculatorFacade;

    @BeforeEach
    public void setUp() {
        calculatorFacade = new CalculatorFacade();
    }

    @Test
    public void shouldCalculateAllOperationIfFileNameIsCorrectAndAllCommandsInFileAreValid() throws FileNotFoundException, EmptyFileException {
        //given
        String fileName = "calculate_1.txt";
        //when
        int expectedValue = 36;
        int returnValue = calculatorFacade.calculateResult(FILE_DIRECTORY + fileName);
        //then
        Assertions.assertEquals(expectedValue, returnValue);
    }

    @Test
    public void shouldThrowExceptionIfFileIsIncorrectOrSomeOperationIsInvalid() {
        //given
        String divideByZeroFile = "calculate_4.txt";
        String wrongOperationTypeFile = "calculate_5.txt";
        String missingNumberFile = "calculate_6.txt";
        String emptyFile = "calculate_7.txt";
        //then
        Assertions.assertThrows(ArithmeticException.class,
                () -> calculatorFacade.calculateResult(FILE_DIRECTORY + divideByZeroFile));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculatorFacade.calculateResult(FILE_DIRECTORY + wrongOperationTypeFile));
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> calculatorFacade.calculateResult(FILE_DIRECTORY + missingNumberFile));
        Assertions.assertThrows(EmptyFileException.class,
                () -> calculatorFacade.calculateResult(FILE_DIRECTORY + emptyFile));
    }

    @Test
    public void shouldCreateCalculatorObjectInstanceIfFileNameIsCorrect() throws FileNotFoundException {
        //given
        String fileName = "calculate_2.txt";
        //when
        Calculator returnResult = calculatorFacade.createCalculator(FILE_DIRECTORY + fileName);
        //then
        Assertions.assertTrue(Objects.nonNull(returnResult));
    }

    @Test
    public void shouldThrowExceptionIfFileNameIsIncorrect() {
        //given
        String incorrectFileName = "incorrect_file_name.txt";
        //then
        Assertions.assertThrows(FileNotFoundException.class, () -> calculatorFacade.createCalculator(incorrectFileName));
    }
}
