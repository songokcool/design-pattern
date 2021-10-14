package com.fibonacci.pattern.singleton.demo;

/**
 * 懒汉模式单例
 * 加上volatile，synchronized关键字，保证线程安全
 * 缺点：每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
 *
 * @author fibonacci
 * @date 2021-10-14 23:34
 */
public class LazySingleton {

    private static volatile LazySingleton singleton = null;

    public LazySingleton() {

    }

    public static synchronized LazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
