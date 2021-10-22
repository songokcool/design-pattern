package com.fibonacci.pattern.strategy.demo;

/**
 * 环境类
 *
 * @author fibonacci
 * @date 2021-10-22 22:03
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
