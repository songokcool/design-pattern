package com.fibonacci.pattern.bridge.demo;

/**
 * @author fibonacci
 * @date 2021-10-17 15:06
 */
public abstract class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public Implementor getImplementor() {
        return implementor;
    }

    public abstract void operation();
}
