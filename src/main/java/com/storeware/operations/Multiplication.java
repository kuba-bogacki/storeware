package com.storeware.operations;

import com.storeware.Operation;

public class Multiplication implements Operation {

    private static Multiplication instance;

    private Multiplication() {}

    public static Multiplication getInstance() {
        if (instance == null) {
            instance = new Multiplication();
        }
        return instance;
    }

    @Override
    public int doSimpleCalculation(int previousNumber, int nextNumber) {
        return previousNumber * nextNumber;
    }
}
