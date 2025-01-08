package com.example.junit_testing.Testing_Tutorial;

public class Calculator {

    public int add(int x, int y) {
        return x+y;
    }

    public int subtract(int x, int y) {
        return x-y;
    }

    public int multiply(int x, int y) {
        return x*y;
    }

    public int addManyNumbers(int ...nums) {
        int sum = 0;
        for(int i: nums) {
            sum += i;
        }
        return sum;
    }

    public boolean isEven(int x) {
        return x%2 == 0;
    }
}
