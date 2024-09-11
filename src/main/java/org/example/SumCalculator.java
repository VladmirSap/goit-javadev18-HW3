package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than or equal to 1");
        }
        return n * (n + 1) / 2;
    }

}
