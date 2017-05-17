package com.viashare.pipe;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by Jeffy on 16/03/15.
 */
public class PipeMain {

    public static void main(String[] args) throws IOException {
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();
        final PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

        new Thread(()->{
            try {
                pipedOutputStream.write("hello piped input stream".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                int data = pipedInputStream.read();
                while (data !=-1){
                    System.err.println((char) data);
                    data = pipedInputStream.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
