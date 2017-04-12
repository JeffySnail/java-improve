package com.viashare.builder;

/**
 * Created by Jeffy on 17/4/12.
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
