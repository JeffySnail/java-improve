package com.viashare.exception;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Jeffy on 17/5/14.
 */
public abstract class ExceptionTemplate {

    public void processTemplate(String path){
        System.err.println(path);
        process(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        });
    }

    public abstract void process(InputStream inputStream);
}
