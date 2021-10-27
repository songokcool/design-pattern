package com.fibonacci.pattern.iterator.demo;

/**
 * 抽象迭代器
 *
 * @author fibonacci
 * @date 2021-10-27 22:48
 */
public interface Iterator {

    public Object first();

    public Object next();

    boolean hasNext();
}
