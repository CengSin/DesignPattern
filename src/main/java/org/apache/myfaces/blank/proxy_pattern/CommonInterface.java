package org.apache.myfaces.blank.proxy_pattern;

/**
 * @className CommonInterface
 * @description star和broker的公共方法抽象出来的接口
 */
public interface CommonInterface {

    /**
     * 用于和第三方交流的接口
     * @return 交流的内容
     */
    String communication();

}
