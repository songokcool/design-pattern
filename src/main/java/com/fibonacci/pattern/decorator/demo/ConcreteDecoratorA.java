package com.fibonacci.pattern.decorator.demo;

/**
 * @author fibonacci
 * @date 2021-05-18 22:22
 */
public class ConcreteDecoratorA extends Decorator{

    private String addState;

    @Override
    public void operation() {
        super.operation();
        addState = "New State";
        System.out.println("具体装饰对象A的操作: " + addState);
    }
}
