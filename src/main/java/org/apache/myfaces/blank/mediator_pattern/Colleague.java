package org.apache.myfaces.blank.mediator_pattern;

/**
 * 抽象同事类，用来表明对象的行为
 */
public interface Colleague {

    void sendMsg(String message, Class<? extends Colleague> clazz);

    void receive(String message);

}
