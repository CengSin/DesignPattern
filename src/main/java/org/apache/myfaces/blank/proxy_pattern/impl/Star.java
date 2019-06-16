package org.apache.myfaces.blank.proxy_pattern.impl;

import org.apache.myfaces.blank.proxy_pattern.CommonInterface;

/**
 * 明星类
 */
public class Star implements CommonInterface {


    @Override
    public String communication() {
        return "林俊杰说：林俊杰唱歌真好听";
    }
}
