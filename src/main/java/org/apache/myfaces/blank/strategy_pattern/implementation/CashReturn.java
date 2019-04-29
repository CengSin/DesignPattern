package org.apache.myfaces.blank.strategy_pattern.implementation;

/**
 * 返利收费子类
 */
public class CashReturn implements CashSuper {

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    public CashReturn() {
    }

    @Override public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) result -= (money / moneyCondition) * moneyReturn;
        return result;
    }
}
