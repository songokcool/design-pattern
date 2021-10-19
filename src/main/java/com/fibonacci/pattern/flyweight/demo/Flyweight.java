package com.fibonacci.pattern.flyweight.demo;

/**
 * 抽象享元角色
 *
 * @author fibonacci
 * @date 2021-10-19 22:42
 */
public interface Flyweight {

    public void operation(UnsharedConcreteFlyweight state);

}
