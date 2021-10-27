package com.fibonacci.pattern.iterator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合
 *
 * @author fibonacci
 * @date 2021-10-27 22:49
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
