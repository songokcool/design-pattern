package com.fibonacci.pattern.command.demo;

/**
 * 调用者
 *
 * @author fibonacci
 * @date 2021-10-23 22:37
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        System.out.println("调用者执行命令");
        command.execute();
    }
}
