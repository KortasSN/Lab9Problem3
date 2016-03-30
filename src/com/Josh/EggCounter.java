package com.Josh;
import java.util.Observable;
import java.util.Observer;
/**
 * Created by Destro on 3/28/2016.
 */
public class EggCounter implements Observer {    //states the EggCounter is an Observer//

    @Override
    public void update(Observable chicken, Object arg) {   //this is called from the Chicken class (notifyObserver)
                                                           //with the mavis, betty or beulah object
        //if (((Chicken)chicken).laidEgg()) {
            ((Chicken)chicken).eggs = ((Chicken) chicken).eggs + 1;    //chicken object mavis, betty or beulah gets an addition of an egg
            System.out.println(chicken.toString() + " has laid " + ((Chicken) chicken).eggs + " egg(s) total.");  //output string
        }
    }

