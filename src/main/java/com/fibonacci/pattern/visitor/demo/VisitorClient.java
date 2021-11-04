package com.fibonacci.pattern.visitor.demo;

import java.util.Date;

/**
 * @author fibonacci
 * @date 2021-10-27 23:20
 */
public class VisitorClient {

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());

        ConcreteVisitorA va = new ConcreteVisitorA();
        os.accept(va);
        System.out.println("------------------------");
        ConcreteVisitorB vb = new ConcreteVisitorB();
        os.accept(vb);
        // Tue Nov 02 21:48:20 CST 2021 +0800
        //
        System.out.println(new Date());
    }

}
