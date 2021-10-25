package com.fibonacci.pattern.chain.demo;

/**
 * 抽象处理者角色
 *
 * @author fibonacci
 * @date 2021-10-25 22:18
 */
public abstract class Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public abstract void handleRequest(String request);
}
