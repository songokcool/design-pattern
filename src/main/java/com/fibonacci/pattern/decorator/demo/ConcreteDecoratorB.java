package com.fibonacci.pattern.decorator.demo;

/**
 * @author fibonacci
 * @date 2021-05-18 22:23
 */
public class ConcreteDecoratorB extends Decorator{

    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addBehavior(){
        System.out.println("具体装饰对象B的特有操作");
    }
}
