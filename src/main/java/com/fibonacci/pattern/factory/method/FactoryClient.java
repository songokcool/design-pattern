package com.fibonacci.pattern.factory.method;

/**
 * @author fibonacci
 * @date 2021-05-20 22:07
 */
public class FactoryClient {

    public static void main(String[] args) {
        UndergraduateFactory undergraduateFactory = new UndergraduateFactory();
        LeiFeng leiFeng = undergraduateFactory.createLeiFeng();
        leiFeng.wash();
        leiFeng.sweep();
        leiFeng.buyRice();
    }

}
