package com.fibonacci.pattern.builder.demo;

/**
 * @author fibonacci
 * @date 2021-05-30 22:09
 */
public class ConcreteBuilderB extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件x");
    }

    @Override
    public void buildPartB() {
        product.add("部件y");
    }

    @Override
    public Product getResult() {
        return this.product;
    }
}
