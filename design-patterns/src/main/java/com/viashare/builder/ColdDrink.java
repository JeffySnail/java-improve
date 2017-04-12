package com.viashare.builder;

/**
 * Created by Jeffy on 17/4/12.
 */
public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
