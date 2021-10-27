package com.fibonacci.pattern.visitor.demo;

/**
 * 抽象元素类
 *
 * @author fibonacci
 * @date 2021-10-27 23:11
 */
public interface Element {

    public void accept(Visitor visitor);

}
