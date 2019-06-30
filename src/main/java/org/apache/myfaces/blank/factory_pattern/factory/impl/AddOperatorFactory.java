package org.apache.myfaces.blank.factory_pattern.factory.impl;

import org.apache.myfaces.blank.factory_pattern.factory.OperatorFactory;
import org.apache.myfaces.blank.factory_pattern.product.Operator;
import org.apache.myfaces.blank.factory_pattern.product.impl.OperatorAdd;

/**
 * @author zhangzetao
 */
public class AddOperatorFactory implements OperatorFactory {
    @Override
    public Operator createOperator() {
        return new OperatorAdd();
    }
}
