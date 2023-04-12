package com.storeware;

import com.storeware.exceptions.EmptyFileException;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;

public class CalculatorFacade {

    public int calculateResult(String fileName) throws FileNotFoundException, EmptyFileException {
        Calculator calculator = createCalculator(fileName);
        ArrayDeque<String> operationCommands = calculator.getOperationCommands();
        if (!operationCommands.isEmpty()) {
            int result = 0;
            for (String operation : operationCommands) {
                result = calculator.makeSingleOperation(result, operation);
            }
            return result;
        }
        throw new EmptyFileException();
    }

    public Calculator createCalculator(String fileName) throws FileNotFoundException {
        String readFileToCalculate = FileReader.readFileToMakeCalculation(fileName);
        return new Calculator(readFileToCalculate);
    }
}
