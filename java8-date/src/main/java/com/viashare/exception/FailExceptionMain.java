package com.viashare.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Jeffy on 16/04/13.
 */
public class FailExceptionMain {

    public static void main(String[] args) throws WrapperException {
        InputStream input = null;
        try{

            input = new FileInputStream("test.txt");

        } catch(IOException e){
//            e.printStackTrace();
            throw new WrapperException(e);
        } finally {
            try{
                if(null!=input)
                    input.close();
            } catch(IOException e){
                throw new WrapperException(e);
            }
        }
    }

    static class WrapperException extends Exception{
        private Exception exception;

        public WrapperException(Exception exception) {
            this.exception = exception;
        }
    }
}
