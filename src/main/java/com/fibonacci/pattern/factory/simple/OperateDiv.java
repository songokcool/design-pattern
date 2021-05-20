package com.fibonacci.pattern.factory.simple;

/**
 * @author fibonacci
 * @date 2021-05-20 21:28
 */
public class OperateDiv extends Operation{

    @Override
    public double getResult() {
        if(getNumberB() == 0){
            System.out.println("除数不能为0");
            return 0;
        }
        return getNumberA() / getNumberB();
    }
}
