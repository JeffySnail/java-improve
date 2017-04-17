package com.viashare.iterator;

/**
 * Created by Jeffy on 17/4/14.
 */
public class DemoMain {

    public static void main(String[] args) {
        FruitList fruitList = new FruitList();
        for (Iterator iter = fruitList.getIterator();iter.hasNext(); ) {
            String name = (String) iter.next();
            System.err.println(name);
        }
    }

}
