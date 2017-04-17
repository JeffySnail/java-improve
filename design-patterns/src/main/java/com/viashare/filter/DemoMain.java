package com.viashare.filter;


/**
 * Created by Jeffy on 17/4/13.
 */
public class DemoMain {
    public static void main(String[] args) {

        Person p = new Person();
        String sql = p.createCriteria().andNameIsNotNull().andeightGreaterThan(150f).getSql();
        System.err.println(sql);
    }
}
