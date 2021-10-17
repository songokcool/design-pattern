package com.fibonacci.pattern.bridge.demo;

/**
 * @author fibonacci
 * @date 2021-10-17 15:05
 */
public class ConcreteImplementorA implements Implementor{

    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }

}
