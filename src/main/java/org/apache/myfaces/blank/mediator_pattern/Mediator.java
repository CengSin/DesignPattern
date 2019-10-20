package org.apache.myfaces.blank.mediator_pattern;

/**
 * 抽象协调类，用来声明协调类的行为
 */
public interface Mediator {

    /**
     * 行为，将message发送给指定的class对象
     * @param message 消息
     * @param clazz 指定接受消息对象
     */
    void operation(String message, Class<? extends Colleague> clazz);

}
