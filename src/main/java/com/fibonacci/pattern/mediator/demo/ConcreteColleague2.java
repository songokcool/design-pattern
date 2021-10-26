package com.fibonacci.pattern.mediator.demo;

/**
 * 具体同事1
 * 
 * @author fibonacci
 * @date 2021-10-26 22:50
 */
public class ConcreteColleague2 extends Colleague{

    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        //请中介者转发
        mediator.relay(this);
    }
}
