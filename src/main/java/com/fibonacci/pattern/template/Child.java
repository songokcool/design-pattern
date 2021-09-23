package com.fibonacci.pattern.template;

/**
 * @author fibonacci
 * @date 2021-08-09 16:17
 */
public class Child extends Father {

    private int age;

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
