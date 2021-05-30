package com.fibonacci.pattern.builder.demo;

/**
 * @author fibonacci
 * @date 2021-05-30 22:08
 */
public class ConcreteBuilderA extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return this.product;
    }
}
