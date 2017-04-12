package com.viashare.abstractfactory;

/**
 * Created by Jeffy on 17/4/11.
 */
public class WheelFactory extends AbstractFactory {

    public Tyre choseTyre(String factor) {
        return null;
    }

    public Wheel choseWheel(String size) {
        if("45".equals(size)){
            return new WheelA();
        }else {
            return null;
        }
    }
}
