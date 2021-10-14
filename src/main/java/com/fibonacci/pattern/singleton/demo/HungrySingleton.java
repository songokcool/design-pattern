package com.fibonacci.pattern.singleton.demo;

/**
 * 懒汉模式单例
 * 线程安全的
 *
 * @author fibonacci
 * @date 2021-10-14 23:37
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    public HungrySingleton(){

    }

    public static HungrySingleton getSingleton(){
        return singleton;
    }
}
