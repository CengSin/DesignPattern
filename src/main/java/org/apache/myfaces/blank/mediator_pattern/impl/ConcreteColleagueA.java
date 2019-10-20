package org.apache.myfaces.blank.mediator_pattern.impl;

import org.apache.myfaces.blank.mediator_pattern.Colleague;
import org.apache.myfaces.blank.mediator_pattern.Mediator;

public class ConcreteColleagueA implements Colleague {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMsg(String message, Class<? extends Colleague> clazz) {
        System.out.println("Colleague A send Message : " + message);
        mediator.operation(message, clazz);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague A receive message : " + message);
    }
}
