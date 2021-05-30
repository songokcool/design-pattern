package com.fibonacci.pattern.observer.demo;

/**
 * @author fibonacci
 * @date 2021-05-30 23:28
 */
public class ObserverClient {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "x"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject,"y"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "z"));

        concreteSubject.setSubjectState("abc");

        concreteSubject.notifyObserver();
    }

}
