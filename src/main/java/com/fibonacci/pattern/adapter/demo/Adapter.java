package com.fibonacci.pattern.adapter.demo;

/**
 * @author fibonacci
 * @date 2021-06-02 0:49
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request(){
        adaptee.specificRequest();
    }

}
