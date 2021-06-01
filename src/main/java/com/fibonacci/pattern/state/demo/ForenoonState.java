package com.fibonacci.pattern.state.demo;

/**
 * @author fibonacci
 * @date 2021-06-01 22:37
 */
public class ForenoonState extends State{

    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 12){
            System.out.println("当前时间：" + work.getHour() + "点，上午工作，精神百倍");
        } else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }

}
