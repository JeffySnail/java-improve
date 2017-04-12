package com.viashare.abstractfactory;

/**
 * Created by Jeffy on 17/4/11.
 */
public abstract class AbstractFactory {

    public abstract Tyre choseTyre(String factor);

    public abstract Wheel choseWheel(String size);

}
