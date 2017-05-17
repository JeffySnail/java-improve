package com.viashare;

/**
 * Created by Jeffy on 17/5/16.
 */
public class MyClassLoader extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
