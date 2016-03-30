package com.Josh;

    import java.util.Observable;

    import java.util.Observer;

    public class TestObserver {

        public static void main(String[] args) {


            EggAlert eggAlert = new EggAlert();   //created EggAlert called eggAlert
            EggCounter eggCounter = new EggCounter();   //creates EggCounter called eggCounter

            Chicken mavis = new Chicken("Mavis", 0);  //creates a new Chicken called Mavis starting with 0 eggs
            mavis.addObserver(eggCounter);      //adds the eggCounter observer to the set of observers
            mavis.addObserver(eggAlert);   //adds the eggAlert observer to the set of observers

            Chicken betty = new Chicken("Betty", 0);  //creates a new Chicken called Betty starting with 0 eggs
            betty.addObserver(eggCounter);   //adds the eggCounter observer to the set of observers
            betty.addObserver(eggAlert);   //adds the eggAlert observer to the set of observers

            Chicken beulah = new Chicken("Beulah", 0);  //creates a new Chicken called Beulah starting with 0 eggs
            beulah.addObserver(eggCounter);  //adds the eggCounter observer to the set of observers
            beulah.addObserver(eggAlert);    //adds the eggAlert observer to the set of observers

            mavis.layEgg();   //calls layEgg for object mavis
            betty.layEgg();   //calls layEgg for object betty
            mavis.layEgg();   //calls layEgg for object mavis
            mavis.layEgg();   //calls layEgg for object mavis
            mavis.layEgg();   //calls layEgg for object mavis
            betty.layEgg();   //calls layEgg for object betty
            beulah.layEgg();   //calls layEgg for object beulah
        }

    }



