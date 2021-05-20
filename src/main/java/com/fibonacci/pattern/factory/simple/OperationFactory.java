package com.fibonacci.pattern.factory.simple;

/**
 * @author fibonacci
 * @date 2021-05-20 21:30
 */
public class OperationFactory {

    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperateAdd();
                break;
            case "-":
                operation = new OperateSub();
                break;
            case "*":
                operation = new OperateMul();
                break;
            case "/":
                operation = new OperateDiv();
                break;
            default:

        }
        return operation;
    }

}
