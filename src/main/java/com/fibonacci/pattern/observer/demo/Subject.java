package com.fibonacci.pattern.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fibonacci
 * @date 2021-05-30 23:18
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        observers.forEach(Observer::update);
    }
}
