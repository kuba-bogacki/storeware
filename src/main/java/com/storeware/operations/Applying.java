package com.storeware.operations;

import com.storeware.Operation;

public class Applying implements Operation {

    private static Applying instance;

    private Applying() {}

    public static Applying getInstance() {
        if (instance == null) {
            instance = new Applying();
        }
        return instance;
    }

    @Override
    public int doSimpleCalculation(int previousNumber, int nextNumber) {
        return nextNumber;
    }
}
