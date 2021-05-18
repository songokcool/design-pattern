package com.fibonacci.pattern.decorator.example;

/**
 * @author fibonacci
 * @date 2021-05-18 23:08
 */
public class Finery extends Person{

    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if(person != null){
            person.show();
        }
    }
}
