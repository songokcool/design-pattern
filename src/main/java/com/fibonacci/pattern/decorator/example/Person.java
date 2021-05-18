package com.fibonacci.pattern.decorator.example;

/**
 * @author fibonacci
 * @date 2021-05-18 23:06
 */
public class Person {

    private String name;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的" + name);
    }
}
