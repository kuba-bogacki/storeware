package com.storeware;

import com.storeware.exceptions.EmptyFileException;

import java.io.FileNotFoundException;

public class Main {

    public static String FILE_DIRECTORY = ".\\src\\main\\resources\\";

    public static void main(String[] args) {
        CalculatorFacade calculatorFacade = new CalculatorFacade();
        String fileName = args.length == 0 ? "" : args[0];
        try {
            int result = calculatorFacade.calculateResult(fileName);
            System.out.printf("Result of calculation is %s", result);
        } catch (EmptyFileException e) {
            System.out.println("File is empty, nothing to calculate");
        } catch (FileNotFoundException e) {
            System.out.println("Impossible to read a file");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing number or operator in the calculation");
        } catch (IllegalArgumentException e) {
            System.out.println("Unrecognized math operation");
        }
    }
}
