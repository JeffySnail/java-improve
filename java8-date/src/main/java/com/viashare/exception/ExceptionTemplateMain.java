package com.viashare.exception;

import java.io.InputStream;

/**
 * Created by Jeffy on 17/5/14.
 */
public class ExceptionTemplateMain {
    public static void main(String[] args) {
        new ExceptionTemplate() {
            @Override
            public void process(InputStream inputStream) {
                System.err.println("我们一起去更远的前方");
            }
        }.processTemplate("fuck");
    }


}
