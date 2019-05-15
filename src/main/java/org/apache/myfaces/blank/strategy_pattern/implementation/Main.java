package org.apache.myfaces.blank.strategy_pattern.implementation;

/**
 * 要求实现正常收费，打折收费，满减收费
 */
public class Main {

    public static void main(String[] args) {
        // 正常收费
        CashContext cashContext = new CashContext(CashContext.CashType.NORMAL);
        System.out.println(cashContext.getResult(300));
        // 打折收费
        cashContext = new CashContext(CashContext.CashType.REBATE);
        System.out.println(cashContext.getResult(300));
        // 满减收费
        cashContext = new CashContext(CashContext.CashType.RETURN);
        System.out.println(cashContext.getResult(300));
    }

}
