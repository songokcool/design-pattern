package com.fibonacci.pattern.builder.demo;

/**
 * @author fibonacci
 * @date 2021-05-30 22:10
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }

}
