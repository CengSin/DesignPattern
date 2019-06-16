package org.apache.myfaces.blank.proxy_pattern;

import org.apache.myfaces.blank.proxy_pattern.impl.Broker;

/**
 * 调用指定对象
 */
public class Main {

    public static void main(String[] args) {
        Broker broker = new Broker();
        System.out.println(broker.communication());;
    }

}
