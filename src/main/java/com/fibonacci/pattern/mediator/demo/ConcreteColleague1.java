package com.fibonacci.pattern.mediator.demo;

/**
 * 具体同事1
 *
 * @author fibonacci
 * @date 2021-10-26 22:50
 */
public class ConcreteColleague1 extends Colleague{

    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        //请中介者转发
        mediator.relay(this);
    }
}
