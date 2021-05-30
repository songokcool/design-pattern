package com.fibonacci.pattern.observer.demo;

/**
 * @author fibonacci
 * @date 2021-05-30 23:24
 */
public class ConcreteObserver extends Observer{

    private String name;

    private String observerState;

    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者" + this.name + "的新状态是" + observerState);
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    public ConcreteSubject getSubject() {
        return subject;
    }
}
