package com.Josh;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Destro on 3/28/2016.
 */
public class EggAlert implements Observer {

    public void update(Observable chicken, Object arg) {
        System.out.println(chicken + " has laid an egg");
    }

}