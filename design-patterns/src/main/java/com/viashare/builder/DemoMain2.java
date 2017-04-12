package com.viashare.builder;

/**
 * Created by Jeffy on 17/4/12.
 */
public class DemoMain2 {
    public static void main(String[] args) {
        Person person = Person.param().
                setName("jeffy").
                setHeight(180l).
                setWeight(75)
                .build();
    }
}
