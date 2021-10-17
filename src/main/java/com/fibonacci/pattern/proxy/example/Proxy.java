package com.fibonacci.pattern.proxy.example;

/**
 * @author fibonacci
 * @date 2021-05-19 21:38
 */
public class Proxy implements IGiveGift {

    private Pursuit pursuit;

    public Proxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDoll() {
        pursuit.giveDoll();
    }

    @Override
    public void giveFlowable() {
        pursuit.giveFlowable();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
