package com.xworkz.hosapp;

public class Pipe1Tester {
    public static void main(String a[]) {
        Pipe1 pipe1 = new Pipe1(500, 30, 15, "vectus", "blue");
        System.out.println(pipe1.price + " " + pipe1.length + " " + pipe1.diameter + " " + pipe1.brand + " " + pipe1.color);

        Pipe1 pipe2 = new Pipe1(500, 30, 15, "vectus", "blue");
        System.out.println(pipe2.price + " " + pipe2.length + " " + pipe2.diameter + " " + pipe2.brand + " " + pipe2.color);

        Pipe1 pipe3 = new Pipe1(500, 30, 15, "vectus", "blue");
        System.out.println(pipe3.price + " " + pipe3.length + " " + pipe3.diameter + " " + pipe3.brand + " " + pipe3.color);

    }
}
