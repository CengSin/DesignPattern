package org.apache.myfaces.blank.factory_pattern.product.impl;

import org.apache.myfaces.blank.factory_pattern.product.Operator;

/**
 * @author zhangzetao
 */
public class OperatorAdd extends Operator {
    @Override
    public double getResult() {
        return this.getA() + this.getB();
    }
}
