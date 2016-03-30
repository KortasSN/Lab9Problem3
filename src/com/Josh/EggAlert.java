package com.Josh;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Destro on 3/28/2016.
 */
public class EggAlert implements Observer {    //states the EggAlert is an Observer//

    public void update(Observable chicken, Object arg) {   //this is called from the Chicken class (notifyObserver) with
                                                           //the mavis, betty or beulah object
        if (((Chicken) chicken).laidEgg()) {
            System.out.println(chicken + " has laid an egg");  //output of the chicken object's name with "has laid an egg."

        }

    }
}
