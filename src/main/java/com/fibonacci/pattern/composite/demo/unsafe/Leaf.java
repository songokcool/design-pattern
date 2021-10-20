package com.fibonacci.pattern.composite.demo.unsafe;

/**
 * 树叶构件
 *
 * @author fibonacci
 * @date 2021-10-20 23:08
 */
public class Leaf implements Component{

    private String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
