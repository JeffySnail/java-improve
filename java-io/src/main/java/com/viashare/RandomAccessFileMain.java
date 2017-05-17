package com.viashare;

import java.io.*;
import java.nio.file.Path;
import java.util.RandomAccess;

/**
 * Created by Jeffy on 17/5/15.
 */
public class RandomAccessFileMain {

    public static void main(String[] args) throws IOException {
        String path = "/Users/jeffy-pc/Downloads/test.txt";

//        RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/jeffy-pc/Downloads/test.txt","r");
//        String line = randomAccessFile.readLine();
//        System.err.println(randomAccessFile.length());
//
//        new StringBuffer();
//        System.err.println(line);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        StringBuffer stringBuffer = new StringBuffer();
String line = "";
        while((line = bufferedReader.readLine()) != null){
                stringBuffer.append(line);
        }
        System.err.println(stringBuffer.toString());
//        System.err.println(bufferedReader.readLine());
//
//        bufferedReader.close();
//
//        StringReader stringReader = new StringReader();
    }
}
