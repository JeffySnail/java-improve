package com.viashare.builder;

/**
 * Created by Jeffy on 17/4/12.
 */
public class Person {

    private final String name;

    private final float height;

    private final int weight;

    public static Builder param() {
        return new Builder();
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    static class Builder {
        private String name;

        private float height;

        private int weight;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHeight(float height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }
        public Person build(){
            if(null == name || "".equals(name)){
                throw new IllegalArgumentException("name can not be null");
            }
            return new Person(this);
        }
    }


}
