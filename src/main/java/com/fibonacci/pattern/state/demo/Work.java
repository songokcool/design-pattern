package com.fibonacci.pattern.state.demo;

/**
 * @author fibonacci
 * @date 2021-06-01 22:37
 */
public class Work {

    private State current;

    public Work(){
        current = new ForenoonState();
    }

    private double hour;

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }

    private boolean finish = false;

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setState(State state){
        this.current = state;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
