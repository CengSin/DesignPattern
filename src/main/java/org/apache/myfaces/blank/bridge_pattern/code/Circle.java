package org.apache.myfaces.blank.bridge_pattern.code;

public class Circle extends Pattern {

    public Circle() {
        this.name = "圆形";
    }

    public Circle(Color color) {
        this.color = color;
        this.name = "圆形";
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
