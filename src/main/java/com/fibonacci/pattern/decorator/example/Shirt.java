package com.fibonacci.pattern.decorator.example;

/**
 * @author fibonacci
 * @date 2021-05-18 23:11
 */
public class Shirt extends Finery{

    @Override
    public void show() {
        super.show();
        System.out.println("穿T恤");
    }
}
