package org.example;

public class Calculator {

    public static int getSum(int x, int y) {
        return x+y;
    }

    public static int getDivide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Number can't be divide by 0!");
        }
        return x/y;
    }

    public static int getMultiple(int x, int y) {
        return x*y;
    }
    public static int getSubtract(int x, int y) {
        return x-y;
    }
}
