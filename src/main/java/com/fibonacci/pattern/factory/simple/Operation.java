package com.fibonacci.pattern.factory.simple;

/**
 * @author fibonacci
 * @date 2021-05-20 21:21
 */
public class Operation {

    private double numberA;

    private double numberB;

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public double getResult(){
        return 0;
    }
}
