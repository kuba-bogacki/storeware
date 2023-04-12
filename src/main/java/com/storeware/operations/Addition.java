package com.storeware.operations;

import com.storeware.Operation;

public class Addition implements Operation {

    private static Addition instance;

    private Addition() {}

    public static Addition getInstance() {
        if (instance == null) {
            instance = new Addition();
        }
        return instance;
    }

    @Override
    public int doSimpleCalculation(int previousNumber, int nextNumber) {
        return previousNumber + nextNumber;
    }
}
