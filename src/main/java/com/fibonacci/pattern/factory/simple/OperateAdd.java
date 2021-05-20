package com.fibonacci.pattern.factory.simple;

/**
 * @author fibonacci
 * @date 2021-05-20 21:23
 */
public class OperateAdd extends Operation{

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
