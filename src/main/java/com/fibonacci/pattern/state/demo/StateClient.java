package com.fibonacci.pattern.state.demo;

/**
 * @author fibonacci
 * @date 2021-06-01 23:49
 */
public class StateClient {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();
    }

}
