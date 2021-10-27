package com.fibonacci.pattern.visitor.demo;

/**
 * 具体元素A类
 *
 * @author fibonacci
 * @date 2021-10-27 23:12
 */
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B类的操作";
    }
}
