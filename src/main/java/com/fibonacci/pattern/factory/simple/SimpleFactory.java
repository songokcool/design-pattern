package com.fibonacci.pattern.factory.simple;

/**
 * @author fibonacci
 * @date 2021-10-16 11:33
 */
public class SimpleFactory {

    public static Product makeProduct(int kind){
        if(kind == 1){
            return new ConcreteProduct1();
        }
        if (kind == 2){
            return new ConcreteProduct2();
        }
        return null;
    }

}
