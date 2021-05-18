package com.fibonacci.pattern.decorator.demo;

/**
 * @author fibonacci
 * @date 2021-05-18 22:26
 */
public class DecoratorClient {

    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorA ca = new ConcreteDecoratorA();
        ConcreteDecoratorB cb = new ConcreteDecoratorB();

        ca.setComponent(cc);
        cb.setComponent(ca);
        cb.operation();
    }

}
