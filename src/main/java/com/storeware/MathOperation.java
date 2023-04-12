package com.storeware;

import com.storeware.operations.*;
import com.storeware.type.OperationType;

public class MathOperation {

    private final OperationType operationType;

    private MathOperation(OperationType operationType) {
        this.operationType = operationType;
    }

    public static MathOperation createMathOperation(OperationType operationType) {
        return new MathOperation(operationType);
    }

    public int calculateUsingOperationType(int previousNumber, int nextNumber) {
        return switch (this.operationType) {
            case APPLY -> Applying.getInstance().doSimpleCalculation(previousNumber, nextNumber);
            case ADD -> Addition.getInstance().doSimpleCalculation(previousNumber, nextNumber);
            case SUBTRACT -> Subtraction.getInstance().doSimpleCalculation(previousNumber, nextNumber);
            case MULTIPLY -> Multiplication.getInstance().doSimpleCalculation(previousNumber, nextNumber);
            case DIVIDE -> Division.getInstance().doSimpleCalculation(previousNumber, nextNumber);
            case MODULO -> Remainder.getInstance().doSimpleCalculation(previousNumber, nextNumber);
            case POWER -> Exponentiation.getInstance().doSimpleCalculation(previousNumber, nextNumber);
        };
    }

    public OperationType getOperationType() {
        return operationType;
    }
}
