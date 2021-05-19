package com.fibonacci.pattern.proxy.demo;

/**
 * @author fibonacci
 * @date 2021-05-19 21:35
 */
public class Pursuit implements IGiveGift{

    private Girl girl;

    public Pursuit(Girl girl){
        this.girl = girl;
    }

    @Override
    public void giveDoll() {
        System.out.println("给 " +girl.getName() + " 送洋娃娃");
    }

    @Override
    public void giveFlowable() {
        System.out.println("给 " +girl.getName() + " 送鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println("给 " +girl.getName() + " 送巧克力");
    }
}
