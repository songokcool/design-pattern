package com.fibonacci.pattern.observer.demo;

/**
 * 具体目标
 *
 * @author fibonacci
 * @date 2021-05-30 23:23
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

}
