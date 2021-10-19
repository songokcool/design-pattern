package com.fibonacci.pattern.flyweight.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色
 *
 * @author fibonacci
 * @date 2021-10-19 22:46
 */
public class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被获取了");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
