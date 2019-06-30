package org.apache.myfaces.blank.factory_pattern;

import org.apache.myfaces.blank.factory_pattern.factory.OperatorFactory;
import org.apache.myfaces.blank.factory_pattern.factory.impl.AddOperatorFactory;
import org.apache.myfaces.blank.factory_pattern.product.Operator;

public class Main {

    public static void main(String[] args) {
        OperatorFactory factory = new AddOperatorFactory();
        Operator operator = factory.createOperator();
        operator.setA(1);
        operator.setB(2);
        System.out.println(operator.getResult());
    }

}
