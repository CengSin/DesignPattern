package org.apache.myfaces.blank.strategy_pattern.simple_implementation;

public class Context {

    private Strategy strategy;

    public Context() {
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }

}
