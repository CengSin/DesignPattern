package org.apache.myfaces.blank.bridge_pattern.code;

public class Client {

    public static Pattern getPattern(String name, String clr) {
        Pattern pattern = null;
        if ("圆形".equals(name)) {
            pattern = new Circle();
        }

        Color color = null;
        if ("红色".equals(clr)) {
            color = new Red();
        }

        if (pattern != null) {
            pattern.setColor(color);
        }

        return pattern;
    }

    public static void main(String[] args) {
        System.out.println(Client.getPattern("圆形", "红色"));
    }

}
