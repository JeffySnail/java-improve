package com.viashare.command;

/**
 * Created by Jeffy on 17/4/13.
 */
public class Stock {

    private String name;//股票名称

    private int quantity;//数量

    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }
    public  void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }
}
