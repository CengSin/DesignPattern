package org.apache.myfaces.blank.strategy_pattern.implementation;

/**
 * 打折收费子类
 */
public class CashRebate implements CashSuper {

    private double mongeyRebate = 1d;

    public CashRebate(double mongeyRebate) {
        this.mongeyRebate = mongeyRebate;
    }

    public CashRebate() {
    }

    @Override
    public double acceptCash(double money) {
        return money * mongeyRebate;
    }
}
