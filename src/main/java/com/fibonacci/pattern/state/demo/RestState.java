package com.fibonacci.pattern.state.demo;

/**
 * @author fibonacci
 * @date 2021-06-01 23:27
 */
public class RestState extends State{

    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点，下班回家了");
    }

}
