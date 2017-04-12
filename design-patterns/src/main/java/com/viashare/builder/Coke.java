package com.viashare.builder;

/**
 * Created by Jeffy on 17/4/12.
 */
public class Coke extends ColdDrink{
    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}
