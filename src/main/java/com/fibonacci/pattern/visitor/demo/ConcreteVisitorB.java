package com.fibonacci.pattern.visitor.demo;

/**
 * 具体访问者B类
 *
 * @author fibonacci
 * @date 2021-10-27 23:16
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B类访问 --> " + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B类访问 --> " + element.operationB());
    }
}
