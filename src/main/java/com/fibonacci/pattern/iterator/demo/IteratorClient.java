package com.fibonacci.pattern.iterator.demo;

/**
 * @author fibonacci
 * @date 2021-10-27 22:55
 */
public class IteratorClient {

    public static void main(String[] args) {
        Aggregate ca = new ConcreteAggregate();
        ca.add("清华大学");
        ca.add("北京大学");
        ca.add("中国人民大学");
        ca.add("复旦大学");
        Iterator iterator = ca.getIterator();

        System.out.println(iterator.first());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
