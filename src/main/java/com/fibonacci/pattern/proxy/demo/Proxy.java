package com.fibonacci.pattern.proxy.demo;

/**
 * @author fibonacci
 * @date 2021-05-19 22:17
 */
public class Proxy extends Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
