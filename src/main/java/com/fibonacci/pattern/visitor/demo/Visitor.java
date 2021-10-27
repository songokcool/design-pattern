package com.fibonacci.pattern.visitor.demo;

/**
 * 抽象访问者
 *
 * @author fibonacci
 * @date 2021-10-27 23:11
 */
public interface Visitor {

    public void visit(ConcreteElementA element);

    public void visit(ConcreteElementB element);
}
