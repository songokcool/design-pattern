package com.fibonacci.pattern.template.demo;

import com.fibonacci.pattern.template.demo.AbstractClass;
import com.fibonacci.pattern.template.demo.ConcreteClassA;
import com.fibonacci.pattern.template.demo.ConcreteClassB;

/**
 * @author fibonacci
 * @date 2021-05-25 22:53
 */
public class TemplateClient {

    public static void main(String[] args) {
        AbstractClass concreteClassA = new ConcreteClassA();
        concreteClassA.templateMethod();

        AbstractClass concreteClassB = new ConcreteClassB();
        concreteClassB.templateMethod();
    }

}
