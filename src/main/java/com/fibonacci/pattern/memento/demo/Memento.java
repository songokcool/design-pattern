package com.fibonacci.pattern.memento.demo;

/**
 * @author fibonacci
 * @date 2021-06-02 22:49
 */
public class Memento {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
