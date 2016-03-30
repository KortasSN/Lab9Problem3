package com.Josh;

import java.util.Observable;

/**
 * Created by Destro on 3/28/2016.
 */

public class Chicken extends Observable {   //makes the Chicken class an observed class

    String name;
    int eggs;
    boolean laidEgg = false;   //initial setting of false
    //int eggs;
    Chicken(String name, int eggs){       //constructor for the Chicken object
        this.name = name;
        this.eggs = eggs;
    }


    public void layEgg(){     //method to lay an egg for the object, either mavis, betty or beulah
        this.laidEgg = true;   //sets it to true
        this.setChanged();    //to notify the method has changed
        this.notifyObservers();   //mavis, betty or beulah cause the update() to be called in the two observers EggAlert and EggCounter
        this.laidEgg = false;  //sets back to false
    }


    public String toString() {

        return this.name;
    }

    public boolean laidEgg(){
        return laidEgg;
    }
}