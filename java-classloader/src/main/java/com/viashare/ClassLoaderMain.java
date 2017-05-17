package com.viashare;

/**
 * Created by Jeffy on 17/5/16.
 */
public class ClassLoaderMain {

    public static void main(String[] args) {
        ClassLoader loader = new ClassLoaderMain().getClass().getClassLoader();
        while(loader != null){
            System.err.println(loader);
            loader= loader.getParent();
        }

    }
}
