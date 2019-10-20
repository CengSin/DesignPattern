package org.apache.myfaces.blank.mediator_pattern;

import org.apache.myfaces.blank.mediator_pattern.impl.ConcreteColleagueA;
import org.apache.myfaces.blank.mediator_pattern.impl.ConcreteColleagueB;
import org.apache.myfaces.blank.mediator_pattern.impl.ConcreteMediator;

/**
 * 中介者模式Main
 */
public class MediatorTestMain {

    public static void main(String[] args) {
        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA();
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB();
        Mediator mediator = new ConcreteMediator(concreteColleagueA, concreteColleagueB);
        concreteColleagueA.setMediator(mediator);
        concreteColleagueB.setMediator(mediator);

        concreteColleagueA.sendMsg("你好，同事B", ConcreteColleagueB.class);
        concreteColleagueB.sendMsg("Hello, 你好，同事A", ConcreteColleagueA.class);
    }

}
