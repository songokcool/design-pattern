package com.fibonacci.pattern.visitor.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象构造角色
 *
 * @author fibonacci
 * @date 2021-10-27 23:18
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<Element>();

    public void accept(Visitor visitor) {
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
