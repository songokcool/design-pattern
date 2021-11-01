package com.fibonacci.pattern.interpreter.demo;

import java.util.Date;

/**
 * 环境类
 *
 * @author fibonacci
 * @date 2021-10-28 21:51
 */
public class Context {

    private AbstractExpression exp;

    public Context() {
        // 数据初始化

    }

    public void operation(String info) {
        // 调用相关表达式类的解释方法

    }

    /**
     * Sat Oct 30 09:24:28 CST 2021 +0800
     */
    public static void main(String[] args){
        System.out.println(new Date());
    }
}
