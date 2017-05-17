package com.viashare;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jeffy on 17/5/17.
 */
//@JsonIgnoreProperties({"firstName","lastName"})
public class Person {


    private String firstName;

    private String lastName;

    private String personId;

    private Address address;

    @JsonValue
    public String toJson(){
        return this.firstName+","+this.lastName;
    }

    private Map<String, Object> properties = new HashMap();

    @JsonAnyGetter
    public Map<String, Object> properties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    @JacksonInject
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @JsonIgnoreType
    public static class Address{
        public String streetName  = null;
        public String houseNumber = null;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personId='" + personId + '\'' +
                '}';
    }
}
