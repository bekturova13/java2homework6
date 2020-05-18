package com.company;

import java.security.DrbgParameters;

public class Math <N extends Number> implements Operatable{
    private N num1;
    private N num2;

    public N getNum1() {
        return num1;
    }

    public void setNum1(N num1) {
        this.num1 = num1;
    }

    public N getNum2() {
        return num2;
    }

    public void setNum2(N num2) {
        this.num2 = num2;
    }

    @Override
    public void makeMultiply() {
    }

    public Math(N num1, N num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void makeAddition() {

    }
}
