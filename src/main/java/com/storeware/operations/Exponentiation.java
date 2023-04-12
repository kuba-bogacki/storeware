package com.storeware.operations;

import com.storeware.Operation;

public class Exponentiation implements Operation {

    private static Exponentiation instance;

    private Exponentiation() {}

    public static Exponentiation getInstance() {
        if (instance == null) {
            instance = new Exponentiation();
        }
        return instance;
    }

    @Override
    public int doSimpleCalculation(int previousNumber, int nextNumber) {
        return (int) Math.pow(previousNumber, nextNumber);
    }
}
