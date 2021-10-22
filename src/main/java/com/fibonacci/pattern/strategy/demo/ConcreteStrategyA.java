package com.fibonacci.pattern.strategy.demo;

/**
 * 具体策略A
 *
 * @author fibonacci
 * @date 2021-10-22 22:02
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A");
    }
}
