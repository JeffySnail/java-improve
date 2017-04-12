package com.viashare.starvation;

/**
 * Created by Jeffy on 17/4/9.
 */
public class Starvation {

    public static boolean isLocked = false;

    public static void main(String[] args) {
     check();
        isLocked = true;

        Thread thread = new Thread(()->{
            System.err.println("fukc");
        });
//        thread.wait();


    }

    private static  void check(){
        while (isLocked){
            System.err.println("fuck");
        }
    }


}
