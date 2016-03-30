package com.Josh;
import java.util.Observable;
import java.util.Observer;
/**
 * Created by Destro on 3/28/2016.
 */
public class EggCounter implements Observer {

    //int eggs;
    //EggCounter(int eggs) {
    //    this.eggs = eggs;
    //}

    //public void counter(Observable EggAlert, Object arg) {
    //    this.eggs = this.eggs++;
    //    System.out.println("hitting the counter in EggCounter class");
    //}

    @Override
    public void update(Observable chicken, Object arg) {

        if (((Chicken)chicken).laidEgg()) {
            ((Chicken)chicken).eggs = ((Chicken) chicken).eggs + 1;
            System.out.println(chicken.toString() + " has laid " + ((Chicken) chicken).eggs + " egg(s) total.");
        }
    }
}
