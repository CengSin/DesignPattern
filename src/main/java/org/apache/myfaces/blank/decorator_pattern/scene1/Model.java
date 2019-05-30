package org.apache.myfaces.blank.decorator_pattern.scene1;

/**
 * @ClassName Model
 * @Description 产品，账户，组合的抽象类
 * @Author zhangzetao
 * @Date 2019/5/30 12:30
 * @Version 1.0
 **/
public interface Model {

    /**
     * 强增操作
     */
    void add();

    /**
     * 强减操作
     */
    void sub();

}
