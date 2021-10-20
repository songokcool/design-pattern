package com.fibonacci.pattern.composite.demo.safe;

/**
 * @author fibonacci
 * @date 2021-10-20 23:17
 */
public class Leaf implements Component{

    private String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
