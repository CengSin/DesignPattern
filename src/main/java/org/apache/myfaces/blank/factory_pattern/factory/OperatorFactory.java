package org.apache.myfaces.blank.factory_pattern.factory;

import org.apache.myfaces.blank.factory_pattern.product.Operator;

/**
 * @author zhangzetao
 */
public interface OperatorFactory {

    /**
     * 获取操作对象
     * @return 操作对象
     */
    Operator createOperator();

}
