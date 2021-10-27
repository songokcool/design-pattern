package com.fibonacci.pattern.iterator.demo;

/**
 * 抽象聚合
 *
 * @author fibonacci
 * @date 2021-10-27 22:47
 */
public interface Aggregate {

    public void add(Object obj);

    public void remove(Object obj);

    public Iterator getIterator();
}
