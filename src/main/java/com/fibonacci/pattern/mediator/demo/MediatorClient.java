package com.fibonacci.pattern.mediator.demo;

/**
 * @author fibonacci
 * @date 2021-10-26 22:53
 */
public class MediatorClient {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague c1 = new ConcreteColleague1();
        Colleague c2 = new ConcreteColleague2();

        mediator.register(c1);
        mediator.register(c2);

        c1.send();
        System.out.println("-----------------");
        c2.receive();
    }

}
