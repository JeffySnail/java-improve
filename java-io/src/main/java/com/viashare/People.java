package com.viashare;

import java.io.Serializable;

/**
 * Created by Jeffy on 17/5/17.
 */
public class People implements Serializable{

    String name = "";

    String sex = "";

    String height = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
