package com.fibonacci.pattern.bridge.demo;

/**
 * @author fibonacci
 * @date 2021-10-17 15:13
 */
public class BridgeClient {

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        RefinedAbstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }

}
