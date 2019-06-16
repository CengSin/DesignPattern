package org.apache.myfaces.blank.proxy_pattern.impl;

import org.apache.myfaces.blank.proxy_pattern.CommonInterface;

import java.util.Optional;

/**
 * 林俊杰经纪人，这里是代理对象
 */
public class Broker implements CommonInterface {

    /**
     * 真实调用对象
     */
    private Star linJJ;

    public Broker() {
        this.linJJ = new Star();
    }

    @Override
    public String communication() {
        return "Proxy : " + Optional.ofNullable(linJJ)
                .map(Star::communication)
                .get();
    }
}
