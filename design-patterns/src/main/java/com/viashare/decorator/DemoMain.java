package com.viashare.decorator;

/**
 * Created by Jeffy on 17/4/13.
 */
public class DemoMain {

    public static void main(String[] args) {
        CarService carService = new GreenCarDecorator(new GreenCar());
        carService.run();
    }
}
