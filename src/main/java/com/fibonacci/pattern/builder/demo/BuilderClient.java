package com.fibonacci.pattern.builder.demo;

/**
 * @author fibonacci
 * @date 2021-05-30 22:11
 */
public class BuilderClient {

    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilderA concreteBuilderA = new ConcreteBuilderA();
        ConcreteBuilderB concreteBuilderB = new ConcreteBuilderB();

        director.construct(concreteBuilderA);
        concreteBuilderA.getResult().show();

        System.out.println("---------------------");

        director.construct(concreteBuilderB);
        concreteBuilderB.getResult().show();
    }

}
