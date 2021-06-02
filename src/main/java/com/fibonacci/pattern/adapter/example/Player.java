package com.fibonacci.pattern.adapter.example;

/**
 * @author fibonacci
 * @date 2021-06-02 21:38
 */
public abstract class Player {

    protected String name;

    public Player(String name){
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
