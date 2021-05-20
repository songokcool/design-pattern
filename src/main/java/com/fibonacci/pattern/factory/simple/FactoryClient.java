package com.fibonacci.pattern.factory.simple;

/**
 * @author fibonacci
 * @date 2021-05-20 21:37
 */
public class FactoryClient {

    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("+");
        operate.setNumberA(19.5d);
        operate.setNumberB(21.87d);
        double result = operate.getResult();
        System.out.println(result);
    }

}
