package com.fibonacci.pattern.proxy.demo;

/**
 * @author fibonacci
 * @date 2021-05-19 21:40
 */
public class ProxyClient {

    public static void main(String[] args) {
        Girl girl = new Girl("李小花");
        Proxy proxy = new Proxy(girl);
        proxy.giveDoll();
        proxy.giveFlowable();
        proxy.giveChocolate();
    }

}
