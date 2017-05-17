package com.viashare.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.viashare.Student;

import java.io.*;
import java.util.Map;

/**
 * Created by Jeffy on 16/5/17.
 */
public class JacksonMain {

    private static final String studentJson = "{\"name\":\"Jeffy\",\"classes\":\"三年级\",\"sex\":\"boy\"}";

    public static void main(String[] args) throws IOException {
//        Student student = new Student();
//        student.setName("Jeffy");
//        student.setSex("boy");
//        student.setClasses("三年级");
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonStudet = objectMapper.writeValueAsString(student);
//
//
//        System.err.println(jsonStudet);
        //read from string value to java Object
//        readStringBytes();
        //read from inputstream to java Object

//        readFromInputStream();

//        readFromReader();

        readJsonToJsonNode();

        writeValueToFile();
    }


    /**
     * read from string value to java Object
     *
     * @throws IOException
     */
    private static final void readStringBytes() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Student stu = objectMapper.readValue(studentJson.getBytes(), Student.class);
        System.err.println(" readStringBytes " + stu.getName());

    }

    private static final void readFromInputStream() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = new ByteArrayInputStream(studentJson.getBytes());
        Map map = objectMapper.readValue(inputStream, Map.class);
        System.err.println("readFromInputStream  " + map.get("name"));
    }

    private static final void readFromReader() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Reader reader = new StringReader(studentJson);
        Student student = objectMapper.readValue(reader, Student.class);
        System.err.println("readFromReader  " + student.toString());

    }

    private static final void readFromString() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = objectMapper.readValue(studentJson, Student.class);
        System.err.println("readFromString  " + student.toString());
    }

    private static final void readFromFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = objectMapper.readValue(new File("/User/jeffy-pc/tes.json"), Student.class);
        System.err.println("readFromFile " + student.toString());


    }

    private static final void readJsonToJsonNode() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readValue(studentJson, JsonNode.class);
        JsonNode name = jsonNode.get("name");
        String s = name.asText();
        System.err.println(s);
    }


    private static final void writeValueToFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

                Student student = new Student();
        student.setName("Jeffy");
        student.setSex("boy");
        student.setClasses("三年级");

        objectMapper.writeValue(new FileOutputStream("/Users/jeffy-pc/Downloads/json.json"), student);
    }

}
