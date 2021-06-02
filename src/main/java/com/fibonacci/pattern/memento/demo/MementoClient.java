package com.fibonacci.pattern.memento.demo;

/**
 * @author fibonacci
 * @date 2021-06-02 23:05
 */
public class MementoClient {

    public static void main(String[] args) {

        Originator o = new Originator();
        o.setState("on");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("off");
        o.show();

        o.setMemento(c.getMemento());
        o.show();
    }

}
