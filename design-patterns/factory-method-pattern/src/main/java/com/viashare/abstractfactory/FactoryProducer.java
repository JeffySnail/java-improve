package com.viashare.abstractfactory;

/**
 * Created by Jeffy on 17/4/11.
 */
public class FactoryProducer {

    public static AbstractFactory producer(String factory) {
        if ("Tyre".equals(factory)) {
            return new TyreFactory();
        } else if ("Wheel".equals(factory)) {
            return new WheelFactory();
        } else {
            System.err.println("么有找到指定工厂");
            return null;
        }
    }
}
