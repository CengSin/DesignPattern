package org.apache.myfaces.blank.strategy_pattern.simple_implementation;

public class Main {

    public static void main(String[] args) {
        Context context1 = new Context(new StrategyA());
        context1.contextInterface();

        Context context2 = new Context(new StrategyB());
        context2.contextInterface();

        Context context3 = new Context(new StrategyC());
        context3.contextInterface();
    }

}
