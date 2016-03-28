package com.Josh;

    import java.util.Observable;

    import java.util.Observer;

    public class TestObserver {

        public static void main(String[] args) {


            EggAlert eggAlert = new EggAlert();
            EggCounter eggCounter = new EggCounter();

            Chicken mavis = new Chicken("Mavis");
            mavis.addObserver(eggCounter);
            mavis.addObserver(eggAlert);

            Chicken betty = new Chicken("Betty");
            betty.addObserver(eggCounter);
            betty.addObserver(eggAlert);

            mavis.layEgg();
            betty.layEgg();
            mavis.layEgg();


        }

    }



