package com.fibonacci.pattern.factory.simple;

/**
 * @author fibonacci
 * @date 2021-05-20 21:27
 */
public class OperateMul extends Operation{

    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
