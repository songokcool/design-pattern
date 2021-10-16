package com.fibonacci.pattern.factory.method;

/**
 * @author fibonacci
 * @date 2021-10-16 11:51
 */
public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
