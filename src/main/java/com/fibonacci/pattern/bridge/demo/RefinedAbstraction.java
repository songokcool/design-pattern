package com.fibonacci.pattern.bridge.demo;

/**
 * @author fibonacci
 * @date 2021-10-17 15:08
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        super.getImplementor().operationImpl();
    }

}
