package com.storeware.operations;

import com.storeware.Operation;

public class Remainder implements Operation {

    private static Remainder instance;

    private Remainder() {}

    public static Remainder getInstance() {
        if (instance == null) {
            instance = new Remainder();
        }
        return instance;
    }

    @Override
    public int doSimpleCalculation(int previousNumber, int nextNumber) {
        return previousNumber % nextNumber;
    }
}
