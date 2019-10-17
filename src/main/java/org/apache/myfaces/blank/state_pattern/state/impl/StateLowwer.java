package org.apache.myfaces.blank.state_pattern.state.impl;

import org.apache.myfaces.blank.state_pattern.StateContext;
import org.apache.myfaces.blank.state_pattern.state.State;

public class StateLowwer implements State {

    private int count = 0;

    @Override
    public void handle(StateContext context, String name) {
        System.out.println(name.toLowerCase());

        if (++count > 1) {
            context.setState(new StateUpper());
        }
    }
}
