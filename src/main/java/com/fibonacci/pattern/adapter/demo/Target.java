package com.fibonacci.pattern.adapter.demo;

/**
 * 目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口
 *
 * @author fibonacci
 * @date 2021-06-02 0:47
 */
public class Target {

    public void request(){
        System.out.println("普通请求");
    }

}
