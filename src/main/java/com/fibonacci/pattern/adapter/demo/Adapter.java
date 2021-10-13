package com.fibonacci.pattern.adapter.demo;

/**
 * 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 *
 * @author fibonacci
 * @date 2021-06-02 0:49
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request(){
        adaptee.specificRequest();
    }

}
