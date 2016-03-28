package com.Josh;

    import java.util.Observable;

    import java.util.Observer;

    public class TestObserver {

        public static void main(String[] args) {


            EggAlert eggAlert = new EggAlert();


            Chicken mavis = new Chicken("Mavis");
            mavis.addObserver(eggAlert);
            Chicken betty = new Chicken("Betty");
            betty.addObserver(eggAlert);
            mavis.layEgg();
            betty.layEgg();
            mavis.layEgg();


        }

    }



