package com.interswitch.maven;

public class SimpleCalculator {

    public Integer sum(int x, int y){
        int sum = 0;
        sum = x + y;
        return sum;
    }

    public Integer difference(int x, int y){
        int difference = 0;
        difference = x - y;
        return difference;
    }

    public Integer multiplication(int x, int y){
        int multiplication = 1;
        multiplication = x * y;
        return multiplication;
    }

    public Double division(int x, int y){
        double division = 1;
        division = (double) x / y;
        return division;
    }
}
