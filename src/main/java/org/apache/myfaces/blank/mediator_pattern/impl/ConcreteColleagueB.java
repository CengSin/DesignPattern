package org.apache.myfaces.blank.mediator_pattern.impl;

import org.apache.myfaces.blank.mediator_pattern.Colleague;
import org.apache.myfaces.blank.mediator_pattern.Mediator;

public class ConcreteColleagueB implements Colleague {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMsg(String message, Class<? extends Colleague> clazz) {
        System.out.println("同事B发送消息，消息内容为:" + message);
        mediator.operation(message, clazz);
    }

    @Override
    public void receive(String message) {
        System.out.println("同事B接收到消息， "  + message);
    }
}
