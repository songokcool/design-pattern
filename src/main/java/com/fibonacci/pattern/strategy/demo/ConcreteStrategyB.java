package com.fibonacci.pattern.strategy.demo;

/**
 * 具体策略B
 *
 * @author fibonacci
 * @date 2021-10-22 22:03
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("具体策略B");
    }
}
