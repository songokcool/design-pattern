package com.fibonacci.pattern.factory.method;

/**
 * @author fibonacci
 * @date 2021-05-20 22:07
 */
public class VolunteerFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
