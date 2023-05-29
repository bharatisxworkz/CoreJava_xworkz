package com.xworkz.train;

public class TrainTester {
    public static void main(String[] args) {
        Compartment compt = new Compartment();
        Train train = new Train(compt);
        Train.compartment.toTravel();
    }
}
