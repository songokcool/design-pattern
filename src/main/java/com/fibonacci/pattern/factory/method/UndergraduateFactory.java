package com.fibonacci.pattern.factory.method;

/**
 * @author fibonacci
 * @date 2021-05-20 22:06
 */
public class UndergraduateFactory implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }

}
