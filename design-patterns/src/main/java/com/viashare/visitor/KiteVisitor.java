package com.viashare.visitor;

/**
 * Created by Jeffy on 17/4/16.
 */
public class KiteVisitor implements Visitor{
    @Override
    public void visit(Home home) {
        home.openTV();
        System.err.println("我得吃个苹果了 ");
    }
}
