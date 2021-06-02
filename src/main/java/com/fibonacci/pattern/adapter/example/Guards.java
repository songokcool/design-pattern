package com.fibonacci.pattern.adapter.example;

/**
 * @author fibonacci
 * @date 2021-06-02 21:43
 */
public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫" + name + "进攻");
    }
}
