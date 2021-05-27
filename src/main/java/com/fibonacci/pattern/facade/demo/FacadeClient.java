package com.fibonacci.pattern.facade.demo;

/**
 * @author fibonacci
 * @date 2021-05-27 22:04
 */
public class FacadeClient {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
    }

}
