package com.fibonacci.pattern.builder.demo;

/**
 * @author fibonacci
 * @date 2021-05-30 22:07
 */
public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
