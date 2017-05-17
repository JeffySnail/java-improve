package com.viashare;

import javafx.scene.web.WebErrorEvent;

import java.io.*;

/**
 * Created by Jeffy on 17/5/17.
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        InputStream inputStream = new FileInputStream("/Users/jeffy-pc/Documents/java-improve/pom.xml");
//        Reader reader = new InputStreamReader(inputStream);
//        byte[] data      = new byte[1024];
//        int line = inputStream.read(data);
//        while(line != -1){
//            System.err.println((char)line);
//            line = inputStream.read(data);
//        }

        People people = new People();
        people.setHeight("name");
        people.setName("jeffy");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/jeffy-pc/Documents/java-improve/People.class"));
        objectOutputStream.writeObject(people);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/jeffy-pc/Documents/java-improve/People.class"));

        People people2 = (People) objectInputStream.readObject();

        System.err.println(people2.getName());


    }
}
