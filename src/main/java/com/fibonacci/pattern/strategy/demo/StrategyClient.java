package com.fibonacci.pattern.strategy.demo;

/**
 * @author fibonacci
 * @date 2021-10-22 22:05
 */
public class StrategyClient {

    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategyA a = new ConcreteStrategyA();
        context.setStrategy(a);
        context.strategyMethod();
    }

}
