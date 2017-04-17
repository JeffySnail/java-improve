package com.viashare.visitor;

/**
 * Created by Jeffy on 17/4/16.
 */
public class TomHome implements Home {
    @Override
    public void openTV() {
        System.err.println("打开电视机");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
