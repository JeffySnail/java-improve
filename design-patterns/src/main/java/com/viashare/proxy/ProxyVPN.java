package com.viashare.proxy;

/**
 * Created by Jeffy on 17/4/13.
 */
public class ProxyVPN implements VisitWeb {

    private VisitWeb visitWeb;

    public ProxyVPN() {
        this.visitWeb = new BJVisit();
    }

    public void visit() {
        visitWeb.visit();
    }
}
