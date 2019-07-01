package org.apache.myfaces.blank.prototype_pattern.code;

/**
 * @author zhangzetao
 */

public class SubClass {

    private int field1;

    private int field2;

    public SubClass() {
    }

    public SubClass(int field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }
}
