package com.fibonacci.pattern.adapter.demo;

/**
 * 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口
 *
 * @author fibonacci
 * @date 2021-06-02 0:48
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("特殊请求");
    }

}
