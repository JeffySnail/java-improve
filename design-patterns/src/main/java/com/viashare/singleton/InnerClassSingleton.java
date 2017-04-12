package com.viashare.singleton;

/**
 * Created by Jeffy on 17/4/11.
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    static class InnerClass {
        private static final InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }

    public InnerClassSingleton getInstance() {
        return InnerClass.innerClassSingleton;
    }
}
