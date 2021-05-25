package com.fibonacci.pattern.template.demo;

/**
 * @author fibonacci
 * @date 2021-05-25 22:51
 */
public class ConcreteClassA extends AbstractClass{
    @Override
    public void primitiveOperationA() {
        System.out.println("子类A的primitiveOperationA方法");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("子类A的primitiveOperationB方法");
    }
}
