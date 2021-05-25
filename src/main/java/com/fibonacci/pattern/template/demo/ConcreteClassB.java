package com.fibonacci.pattern.template.demo;

/**
 * @author fibonacci
 * @date 2021-05-25 22:52
 */
public class ConcreteClassB extends AbstractClass{
    @Override
    public void primitiveOperationA() {
        System.out.println("子类B的primitiveOperationA方法");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("子类B的primitiveOperationB方法");
    }
}
