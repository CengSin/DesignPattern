package org.apache.myfaces.blank.state_pattern;

import org.apache.myfaces.blank.state_pattern.state.State;
import org.apache.myfaces.blank.state_pattern.state.impl.StateUpper;

public class StateContext {

    private State state;

    public StateContext() {
        this.state = new StateUpper();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(String name) {
        state.handle(this, name);
    }

    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        stateContext.request("zhangsan");
        stateContext.request("lisi");
        stateContext.request("wangwu");
        stateContext.request("zhaoliu");
    }

}
