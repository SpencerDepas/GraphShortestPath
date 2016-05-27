package com.clearfaun.playing.around;

import java.util.*;

public class Main {

    static ArrayList<Node> trainStopsGraph = new  ArrayList<Node>();


    public static void main(String[] args) {

        //creates 10 trains with random amount of stops and x random stops
        ArrayList<Train> trains = new ArrayList<Train>();
        for(int i = 0; i < 10; i ++){
            trains.add(new Train(i + ""));
        }


        //creates 100 train stops

        for(int i = 0 ; i < 100; i ++){

            Node trainStop = new Node(i + " ");
            trainStopsGraph.add(i, trainStop);
        }

        ArrayList<Node> newConnectedTrainsGraph = new  ArrayList<Node>();

        //the nodes(vertexes) have been created.
        //This is what creates the edges
        //I iterate through all the nodes
        //and I create one random node
        //I then connect them with an edge
        //every vertex has at least one connection.
        //each station(vertex) is a number
        //the edge is the train track
        for(int i = 0 ; i < 100; i ++){


            Random rand = new Random();
            int randomConnectionOne = rand.nextInt((99 - 0) + 1) + 0;



            //random two trains train out of the one hundred
            Node randomTrainStopNumberOne =trainStopsGraph.get(randomConnectionOne);
            Node currentTrainStop = trainStopsGraph.get(i);


            //undirect graph
            currentTrainStop.addEdge(randomTrainStopNumberOne);
            randomTrainStopNumberOne.addEdge(currentTrainStop);

            newConnectedTrainsGraph.add(i, currentTrainStop);



        }




        //prints out out

        for(int i = 0; i < trainStopsGraph.size(); i++){
            System.out.println("Train" + newConnectedTrainsGraph.get(i) + " Connects to these stops");

            for (Edge edge  : newConnectedTrainsGraph.get(i).outEdges) {
                System.out.println("Train[" +newConnectedTrainsGraph.get(i) + "] Has a connection to "  + edge.to +  " ");
            }

            for (Edge edge  : newConnectedTrainsGraph.get(i).inEdges) {
                System.out.println("Train[" +newConnectedTrainsGraph.get(i) + "] Has a connection to "  + edge.to +  " ");
            }

            System.out.println();
            System.out.println();
            System.out.println();

        }
        //sample output


        //Train0  Connects to these stops
        //Train[0 ] Has a connection to 43
        //Train[0 ] Has a connection to 0



        //Train1  Connects to these stops
        //Train[1 ] Has a connection to 79
        //Train[1 ] Has a connection to 75
        //Train[1 ] Has a connection to 1
        //Train[1 ] Has a connection to 1


        //so now we have the train stops and the train tracks
        //the trains with multiple stops


        //now we need the shortest path





    }
}
