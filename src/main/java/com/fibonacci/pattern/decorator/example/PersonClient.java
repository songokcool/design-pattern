package com.fibonacci.pattern.decorator.example;

/**
 * @author fibonacci
 * @date 2021-05-18 23:12
 */
public class PersonClient {

    public static void main(String[] args) {
        Person person = new Person("Fibonacci");
        Shirt shirt = new Shirt();
        Trouser trouser = new Trouser();

        shirt.setPerson(person);
        trouser.setPerson(shirt);

        trouser.show();
    }

}
