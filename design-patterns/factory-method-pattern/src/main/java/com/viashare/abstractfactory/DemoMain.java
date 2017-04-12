package com.viashare.abstractfactory;

import com.viashare.factory.Factory;

/**
 * Created by Jeffy on 17/4/11.
 */
public class DemoMain {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.producer("Tyre");
        Tyre tyre = factory.choseTyre("A");
        tyre.getFactor();
    }
}
