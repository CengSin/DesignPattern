package org.apache.myfaces.blank.template_pattern.simple;

/**
 * @author
 */
public class TemplatePatternMain {

    public static void main(String[] args) {
        AbstractClass c1 = new ConcreteOperator1();
        AbstractClass c2 = new ConcreteOperator2();

        c1.templateMethod();

        System.out.println("==================");

        c2.templateMethod();
    }

}
