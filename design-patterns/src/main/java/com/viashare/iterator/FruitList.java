package com.viashare.iterator;

/**
 * Created by Jeffy on 17/4/14.
 */
public class FruitList<E extends Container> implements Container {

    public String names[] = {"apple" , "orange" ,"banner" , "pineapple"};

    public Iterator getIterator() {
        return new NameIterator<E>();
    }

    private class NameIterator<E> implements Iterator {

        int index;

        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
