package com.Josh;

import java.util.Observable;

/**
 * Created by Destro on 3/28/2016.
 */

public class Chicken extends Observable {

    String name;

    Chicken(String name){
        this.name = name;
    }

    public void layEgg(){
        this.setChanged();
        this.notifyObservers();
    }


    public String toString() {
        return this.name;
    }

}