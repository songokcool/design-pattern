package com.fibonacci.pattern.proxy.example;

/**
 * @author fibonacci
 * @date 2021-05-19 22:16
 */
public class RealSubject extends Subject{

    @Override
    public void request() {
        System.out.println("真实的请求");
    }

}
