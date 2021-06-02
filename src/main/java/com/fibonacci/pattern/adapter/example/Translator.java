package com.fibonacci.pattern.adapter.example;

/**
 * @author fibonacci
 * @date 2021-06-02 21:49
 */
public class Translator extends Player {

    private ForeignCenter fc = new ForeignCenter();

    public Translator(String name) {
        super(name);
        fc.setName(name);
    }

    @Override
    public void attack() {
        fc.jingong();
    }

    @Override
    public void defense() {
        fc.fangshou();
    }
}
