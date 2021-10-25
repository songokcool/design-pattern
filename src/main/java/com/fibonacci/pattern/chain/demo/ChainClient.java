package com.fibonacci.pattern.chain.demo;

/**
 * @author fibonacci
 * @date 2021-10-25 22:22
 */
public class ChainClient {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setNext(h2);

        h1.handleRequest("two");
    }

}
