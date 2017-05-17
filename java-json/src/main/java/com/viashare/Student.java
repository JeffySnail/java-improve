package com.viashare;

/**
 * Created by Jeffy on 16/5/17.
 */
public class Student {

    private String name;

    private String classes;

    private String sex;

    public Student(String name, String classes, String sex) {
        this.name = name;
        this.classes = classes;
        this.sex = sex;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
