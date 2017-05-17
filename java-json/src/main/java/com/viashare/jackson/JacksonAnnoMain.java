package com.viashare.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.viashare.Person;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jeffy on 16/5/17.
 */
public class JacksonAnnoMain {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper  = new ObjectMapper();
        Person person = new Person();
        person.setFirstName("Lee");
        person.setLastName("jeffy");
        person.setPersonId("009xhihis");

//        Map<String,Object> map = new HashMap();
//        map.put("classes","classes");
//        map.put("school","school");
//        person.setProperties(map);
        String json = objectMapper.writeValueAsString(person);
        System.err.println(json);
        String tempJson = "{\"firstName\":\"Lee\",\"lastName\":\"jeffy\",\"personId\":\"009xhihis\"}";
        InjectableValues inject = new InjectableValues.Std().addValue(String.class, "jenkov.com");

        Person person2 = new ObjectMapper().reader(inject).forType(Person.class).readValue(tempJson);
        System.err.println(person2.getSource());
        System.err.println(person2.getFirstName());
    }
}
