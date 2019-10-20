package org.apache.myfaces.blank.mediator_pattern.impl;

import org.apache.myfaces.blank.mediator_pattern.Colleague;
import org.apache.myfaces.blank.mediator_pattern.Mediator;

public class ConcreteMediator implements Mediator {

    private Colleague colleagueA;

    private Colleague colleagueB;

    public ConcreteMediator(Colleague colleagueA, Colleague colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    @Override
    public void operation(String message, Class<? extends Colleague> clazz) {
        if (colleagueA.getClass().equals(clazz)) {
            colleagueA.receive(message);
        } else {
            colleagueB.receive(message);
        }
    }

}
