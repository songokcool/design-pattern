package com.fibonacci.pattern.state.demo;

/**
 * @author fibonacci
 * @date 2021-06-01 22:47
 */
public class AfternoonState extends State{
    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 17){
            System.out.println("当前时间：" + work.getHour() + "下午状态还不错，继续努力");
        } else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
