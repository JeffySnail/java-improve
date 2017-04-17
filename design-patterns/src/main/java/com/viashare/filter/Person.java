package com.viashare.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeffy on 17/4/13.
 */
public class Person {

    private String name;

    private String sex;

    private float height;

    private float weight;

    public Criteria createCriteria() {
        return new Criteria();
    }

    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        public Criteria() {
            this.criteriaWithoutValue = new ArrayList<String>();
        }

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        public Criteria andNameIsNotNull() {
            addCriterion(String.format("  NAME IS NOT NULL "));
            return this;
        }

        public Criteria andeightGreaterThan(float height) {
            addCriterion(String.format("   HEIGHT > %s  ",height) );
            return this;
        }

        public String getSql() {
            StringBuffer sb = new StringBuffer("SELECT * FROM  PERSON WHERE ");
            for (int i = 0 ;i<criteriaWithoutValue.size();i++) {
                sb.append(criteriaWithoutValue.get(i));
                if(i < criteriaWithoutValue.size()-1){
                    sb.append("AND");
                }
            }
            sb.append(";");
            return sb.toString();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
