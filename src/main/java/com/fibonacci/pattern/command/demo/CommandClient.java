package com.fibonacci.pattern.command.demo;

/**
 * @author fibonacci
 * @date 2021-10-23 22:44
 */
public class CommandClient {

    public static void main(String[] args) {
        ConcreteCommand cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        invoker.call();
    }

}
