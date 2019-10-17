package org.apache.myfaces.blank.state_pattern.state.impl;

import org.apache.myfaces.blank.state_pattern.StateContext;
import org.apache.myfaces.blank.state_pattern.state.State;

/**
 * 将字母转为大写的类
 */
public class StateUpper implements State {

    @Override
    public void handle(StateContext context, String name) {
        System.out.println(name.toUpperCase());
        context.setState(new StateLowwer());
    }

}
