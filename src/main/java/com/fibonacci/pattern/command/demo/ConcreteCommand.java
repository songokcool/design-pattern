package com.fibonacci.pattern.command.demo;

/**
 * @author fibonacci
 * @date 2021-10-23 22:41
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;

    public ConcreteCommand(){
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }

}
