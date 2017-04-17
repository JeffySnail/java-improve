package com.viashare.facade;

/**
 * Created by Jeffy on 17/4/13.
 */
public class Facade {

    private Worker teacher;

    private Worker makeUpGirl ;

    public Facade() {
        this.teacher = new Teacher();
        this.makeUpGirl = new MakeupGirl();
    }

    public void teah(){
        teacher.work();
    }

    public void makeUp(){
        makeUpGirl.work();
    }
}
