package com.Josh;

import java.util.Observable;

/**
 * Created by Destro on 3/28/2016.
 */

public class Chicken extends Observable {

    String name;
    int eggs;
    boolean laidEgg = false;
    //int eggs;
    Chicken(String name, int eggs){
        this.name = name;
        this.eggs = eggs;
    }


    public void layEgg(){
        this.laidEgg = true;
        this.setChanged();
        this.notifyObservers();
        this.laidEgg = false;
    }


    public String toString() {

        return this.name;
    }

    public boolean laidEgg(){
        return laidEgg;
    }
}