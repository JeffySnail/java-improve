package com.viashare.builder;

/**
 * Created by Jeffy on 17/4/12.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "Chicken Burger";
    }
}
