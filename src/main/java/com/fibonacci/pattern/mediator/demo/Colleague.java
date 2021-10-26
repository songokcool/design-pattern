package com.fibonacci.pattern.mediator.demo;

/**
 * 抽象同事类
 *
 * @author fibonacci
 * @date 2021-10-26 22:44
 */
public abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
