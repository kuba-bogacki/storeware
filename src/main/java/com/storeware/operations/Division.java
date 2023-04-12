package com.storeware.operations;

import com.storeware.Operation;

public class Division implements Operation {

    private static Division instance;

    private Division() {}

    public static Division getInstance() {
        if (instance == null) {
            instance = new Division();
        }
        return instance;
    }

    @Override
    public int doSimpleCalculation(int previousNumber, int nextNumber) {
        return previousNumber / nextNumber;
    }
}
