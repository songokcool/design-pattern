package com.fibonacci.pattern.composite.demo.unsafe;

/**
 * @author fibonacci
 * @date 2021-10-20 23:12
 */
public class CompositeClient {

    public static void main(String[] args) {
        Composite c1 = new Composite();
        Composite c2 = new Composite();

        Component l1 = new Leaf("1");
        Component l2 = new Leaf("2");
        Component l3 = new Leaf("3");

        c1.add(l1);
        c1.add(c2);

        c2.add(l2);
        c2.add(l3);

        c1.operation();
    }

}
