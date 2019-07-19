package org.apache.myfaces.blank.builder_pattern.code;

import org.apache.myfaces.blank.builder_pattern.code.entity.Person;

public class Main {

    public static void main(String[] args) {

        Person man = Person.manBuilder()
                .name("张阿三")
                .age(12)
                .height(1.73)
                .build();

        System.out.println(man);

        Person woman = Person.woManBuilder()
                .name("张阿三")
                .age(12)
                .height(1.73)
                .build();

        System.out.println(woman);
    }

}
