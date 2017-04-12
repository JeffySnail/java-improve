package com.viashare.builder;

/**
 * Created by Jeffy on 17/4/12.
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "Veg Burger";
    }
}
