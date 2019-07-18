package org.apache.myfaces.blank.facade_pattern.code;

import org.apache.myfaces.blank.facade_pattern.code.old.Facade;

/**
 * @author zhangzetao
 */
public class NewSystem {

    public void newFunction(String msg) {
        System.out.println(msg + Facade.oldCalc());
    }

    public static void main(String[] args) {
        NewSystem newSystem = new NewSystem();
        newSystem.newFunction("调用新系统");
    }

}
