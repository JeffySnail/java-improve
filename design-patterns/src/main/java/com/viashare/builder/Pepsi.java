package com.viashare.builder;

/**
 * Created by Jeffy on 17/4/12.
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
