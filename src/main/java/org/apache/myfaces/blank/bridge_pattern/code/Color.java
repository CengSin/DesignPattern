package org.apache.myfaces.blank.bridge_pattern.code;

/**
 * 色彩抽象类
 */
public abstract class Color {

    protected String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }
}
