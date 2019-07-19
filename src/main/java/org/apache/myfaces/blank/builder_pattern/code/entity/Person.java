package org.apache.myfaces.blank.builder_pattern.code.entity;

public class Person {

    private String name;
    private int age;
    private double height;
    private String sex;

    public static Person.ManBuilder manBuilder() {
        return new Person.ManBuilder();
    }

    public static Person.WoManBuilder woManBuilder() {
        return new Person.WoManBuilder();
    }

    public static class ManBuilder extends AbstractPersonBuilder {

        public ManBuilder() {
            this.sex = "男";
        }

        @Override
        void sex(String sex) {

        }

        @Override
        public Person.ManBuilder name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public Person.ManBuilder age(int age) {
            this.age = age;
            return this;
        }

        @Override
        public Person.ManBuilder height(double height) {
            this.height = height;
            return this;
        }

    }

    public static class WoManBuilder extends AbstractPersonBuilder {

        public WoManBuilder() {
            this.sex = "女";
        }

        @Override
        void sex(String sex) {

        }

        @Override
        public Person.WoManBuilder name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public Person.WoManBuilder age(int age) {
            this.age = age;
            return this;
        }

        @Override
        public Person.WoManBuilder height(double height) {
            this.height = height;
            return this;
        }

    }

    private abstract static class AbstractPersonBuilder {
        String name;
        int age;
        double height;
        String sex;

        abstract void sex(String sex);

        abstract AbstractPersonBuilder name(String name);

        abstract AbstractPersonBuilder age(int age);

        abstract AbstractPersonBuilder height(double height);

        public Person build() {
            return new Person(name, age, height, sex);
        }

    }

    public Person() {
    }

    public Person(String name, int age, double height, String sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "{ name: " + this.name + ", age : " + this.age + " , sex : " + this.sex + "}";
    }
}
