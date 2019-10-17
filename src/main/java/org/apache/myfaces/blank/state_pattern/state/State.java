package org.apache.myfaces.blank.state_pattern.state;

import org.apache.myfaces.blank.state_pattern.StateContext;

/**
 * 状态类，用来声明对象在不同情况下处理的方法
 */
public interface State {

    void handle(StateContext context, String name);

}
