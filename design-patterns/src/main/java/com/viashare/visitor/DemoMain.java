package com.viashare.visitor;

import org.omg.PortableInterceptor.HOLDING;

/**
 * Created by Jeffy on 17/4/16.
 */
public class DemoMain {

    public static void main(String[] args) {
        Home tomHome = new TomHome();
        tomHome.accept(new KiteVisitor());
    }
}
