package com.viashare.abstractfactory;

/**
 * Created by Jeffy on 17/4/11.
 */
public class TyreFactory extends AbstractFactory {

    public Tyre choseTyre(String factor) {

        if ("A".equals(factor)) {
            return new TyreA();
        } else if ("B".equals(factor)) {
            return new TyreB();
        }

        return null;
    }

    public Wheel choseWheel(String size) {
        return null;
    }
}
