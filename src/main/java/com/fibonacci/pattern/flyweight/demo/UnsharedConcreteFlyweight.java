package com.fibonacci.pattern.flyweight.demo;

/**
 * 非享元角色
 *
 * @author fibonacci
 * @date 2021-10-19 22:35
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info){
        this.info = info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
