package com.fibonacci.pattern.mediator.demo;


import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 *
 * @author fibonacci
 * @date 2021-10-26 22:46
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c: colleagues) {
            if(!c.equals(colleague)){
                c.receive();
            }
        }
    }
}
