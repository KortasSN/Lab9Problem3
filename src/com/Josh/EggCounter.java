package com.Josh;
import java.util.Observable;
import java.util.Observer;
/**
 * Created by Destro on 3/28/2016.
 */
public class EggCounter implements Observer {

    int eggs;
    //EggCounter(int eggs) {
    //    this.eggs = eggs;
    //}

    //public void counter(Observable EggAlert, Object arg) {
    //    System.out.println();
    //}

    @Override
    public void update(Observable Chicken, Object arg) {

       eggs++;
        System.out.println(Chicken.toString() + " has laid " + eggs + " egg(s) total." );
    }
}
