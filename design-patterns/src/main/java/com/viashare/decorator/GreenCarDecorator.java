package com.viashare.decorator;

/**
 * Created by Jeffy on 17/4/13.
 */
public class GreenCarDecorator implements CarService{

    private CarService CarService;

    public GreenCarDecorator(CarService carService){
        this.CarService = carService;

    }
    public void run() {
        CarService.run();
        fly();

    }

    private void fly(){
        System.out.println("i am green car ,i not only can run but also can fly now");
    }
}
