package org.apache.myfaces.blank.strategy_pattern.implementation;

/**
 * 策略模式-环境类，用来统一接管外部对收费算法的调用，外部直接调用context类即可，不需要了解内部算法如何实现
 */
public class CashContext {

    private CashSuper cashSuper;

    public enum CashType {
        NORMAL("正常收费"),
        REBATE("打折收费"),
        RETURN("满减收费");
        private String name;

        public String getName() {
            return name;
        }

        CashType(String name) {
            this.name = name;
        }
    }

    public CashContext(CashType type) {
        switch (type) {
            case NORMAL: cashSuper = new CashNomal();
            break;
            case REBATE: cashSuper = new CashRebate(0.8);
            break;
            case RETURN: cashSuper = new CashReturn(300, 100);
            break;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
