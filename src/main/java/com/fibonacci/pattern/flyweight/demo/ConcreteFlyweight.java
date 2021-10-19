package com.fibonacci.pattern.flyweight.demo;

/**
 * 具体享元角色
 *
 * @author fibonacci
 * @date 2021-10-19 22:43
 */
public class ConcreteFlyweight implements Flyweight{

    private String key;

    public ConcreteFlyweight(String key){
        this.key = key;
        System.out.println("具体享元" + key + "被创建了");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("具体享元" + key + "被调用了");
        System.out.println("非享元信息是" + state.getInfo());
    }
}
