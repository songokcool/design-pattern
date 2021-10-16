package com.fibonacci.pattern.prototype.demo;

/**
 * @author fibonacci
 * @date 2021-10-16 11:08
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("原型创建成功");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功");
        return (Realizetype) super.clone();
    }
}
