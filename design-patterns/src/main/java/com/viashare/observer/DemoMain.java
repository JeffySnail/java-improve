package com.viashare.observer;

/**
 * Created by Jeffy on 17/4/14.
 */
public class DemoMain {
    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.attach(new Observer() {
            public void update() {
                System.err.println("post a request to baidu.com");
            }
        });

        tomcat.attach(new Observer() {
            public void update() {
                System.err.println("post a request to taobao.com");
            }
        });
        tomcat.setStarted(true);
     }
}
