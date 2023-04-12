package com.storeware;

import com.storeware.type.OperationType;

import java.util.ArrayDeque;
import java.util.List;

public class Calculator {

    private final ArrayDeque<String> operationCommands;

    public Calculator(String operations) {
        this.operationCommands = initializeOperationList(operations);
    }

    private ArrayDeque<String> initializeOperationList(String operations) {
        ArrayDeque<String> operationCommands = new ArrayDeque<>();
        if (!operations.isEmpty()) {
            operationCommands = new ArrayDeque<>(List.of(operations.split("\n")));
            String lastElement = operationCommands.removeLast();
            operationCommands.addFirst(lastElement);
        }
        return operationCommands;
    }

    public int makeSingleOperation(int previousNumber, String operationContent) throws IllegalArgumentException {
        String[] operationArray = operationContent.split(" ");
        OperationType operator = OperationType.valueOf(operationArray[0].toUpperCase());
        int nextNumber = Integer.parseInt(operationArray[1]);
        return MathOperation.createMathOperation(operator).calculateUsingOperationType(previousNumber, nextNumber);
    }

    public ArrayDeque<String> getOperationCommands() {
        return operationCommands;
    }

}
