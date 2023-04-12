package com.storeware.operations;

import com.storeware.Operation;

public class Subtraction implements Operation {

    private static Subtraction instance;

    private Subtraction() {}

    public static Subtraction getInstance() {
        if (instance == null) {
            instance = new Subtraction();
        }
        return instance;
    }

    @Override
    public int doSimpleCalculation(int previousNumber, int nextNumber) {
        return previousNumber - nextNumber;
    }
}
