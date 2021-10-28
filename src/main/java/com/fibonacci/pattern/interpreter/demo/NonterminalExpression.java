package com.fibonacci.pattern.interpreter.demo;

/**
 * 非终结符表达式类
 *
 * @author fibonacci
 * @date 2021-10-28 21:49
 */
public class NonterminalExpression implements AbstractExpression {

    private AbstractExpression exp1;

    private AbstractExpression exp2;

    @Override
    public void interpret(String info) {
        //非对终结符表达式的处理
    }

}
