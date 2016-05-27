package com.clearfaun.playing.around;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by SpencerDepas on 5/26/16.
 */
public class Train {

    private ArrayList<String> trainsStops = new  ArrayList<String>();
    private String trainName;

    public Train(String name){
        trainName = name;
        generateRandomStops();

    }

    private void generateRandomStops(){
        //this genrates  random number of stops between 2 and 10

        //it then finds which stops it makes between 1 and 100
        Random rand = new Random();

        int randomNumberOfStops = rand.nextInt((10 - 2) + 1) + 2;
        System.out.print("Train" + trainName + ": ");

        for(int i = 0 ; i < randomNumberOfStops; i ++){

            int randomStop = rand.nextInt((100 - 1) + 1) + 1;
            trainsStops.add(randomStop + "");
            System.out.print(randomStop + " ");

        }

        System.out.println( "");


    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
}
