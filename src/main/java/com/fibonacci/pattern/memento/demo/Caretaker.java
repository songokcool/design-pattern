package com.fibonacci.pattern.memento.demo;

/**
 * @author fibonacci
 * @date 2021-06-02 22:50
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
