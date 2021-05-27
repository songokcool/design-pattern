package com.fibonacci.pattern.facade.demo;

/**
 * @author fibonacci
 * @date 2021-05-27 22:01
 */
public class Facade {

    SubSystemOne one;

    SubSystemTwo two;

    SubSystemThree three;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
    }

    public void methodA(){
        System.out.println("方法组A");
        one.methodOne();
        two.methodTwo();
    }

    public void methodB(){
        System.out.println("方法组B");
        one.methodOne();
        three.methodThree();
    }

    public void methodC(){
        System.out.println("方法组C");
        two.methodTwo();
        three.methodThree();
    }
}
