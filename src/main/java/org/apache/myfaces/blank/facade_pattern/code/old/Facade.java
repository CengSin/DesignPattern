package org.apache.myfaces.blank.facade_pattern.code.old;

public class Facade {

    private static OldSystem1 oldSystem1;

    private static OldSystem2 oldSystem2;

    static {
        oldSystem1 = new OldSystem1();
        oldSystem2 = new OldSystem2();
    }

    public static String oldCalc() {
        oldSystem1.test1();;
        oldSystem2.test2();
        return "调用老系统逻辑";
    }
}
