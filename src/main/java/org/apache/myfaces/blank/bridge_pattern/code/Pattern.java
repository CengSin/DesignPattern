package org.apache.myfaces.blank.bridge_pattern.code;

/**
 * 图形抽象类
 */
public abstract class Pattern {

    protected String name;

    protected Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
