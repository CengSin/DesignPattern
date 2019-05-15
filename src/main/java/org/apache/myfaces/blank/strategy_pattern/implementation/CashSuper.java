package org.apache.myfaces.blank.strategy_pattern.implementation;

/**
 * 收费父类，提供接口定义给子类，子类自定义实现方法
 */
public interface CashSuper {

    /**
     * 默认实现方法，正常收费，不打折不返利
     * @param money 标价
     * @return 实际收取金额
     */
    default double acceptCash(double money) {
        return money;
    }

}
