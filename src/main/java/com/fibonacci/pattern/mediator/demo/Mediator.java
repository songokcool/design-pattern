package com.fibonacci.pattern.mediator.demo;

/**
 * 抽象中介者
 *
 * @author fibonacci
 * @date 2021-10-26 22:43
 */
public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague colleague);

}
