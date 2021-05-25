package com.fibonacci.pattern.template.demo;

/**
 * @author fibonacci
 * @date 2021-05-25 22:48
 */
public abstract class AbstractClass {

    /**
     * 抽象行为，子类实现
     */
    public abstract void primitiveOperationA();

    /**
     * 抽象行为，子类实现
     */
    public abstract void primitiveOperationB();

    /**
     * 模板方法，给出了逻辑的骨架，而逻辑的组成是一些响应的抽象操作，推迟到子类实现
     */
    public void templateMethod(){
        primitiveOperationA();
        primitiveOperationB();
    }
}
