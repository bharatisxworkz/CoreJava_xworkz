package com.xworkz.hosapp;

public class Bar2 {
    static String[] alcohol = {" Royal Stag", " Black Label", " Black& White", " 100 Piper's", " BudWiser", " Tuborg ", " Signature", " Teacher's", " Amrut", " Ballentine", " Kingfisher", " Old Monk", " Black Dog"};

    public static void main(String bar[]) {

        System.out.println(" List of brands available:");
        System.out.println("1:" + alcohol[0] + "\n" + "2:" + alcohol[1] + "\n" + "3:" + alcohol[2] + "\n" + "4:" + alcohol[3] + "\n" + "5:" + alcohol[4] + "\n" + "6:" + alcohol[5] + "\n" + "7:" + alcohol[6] + "\n" + "8:" + alcohol[7] + "\n" + "9:" + alcohol[8] + "\n" + "10:" + alcohol[9] + "\n" + "11:" + alcohol[10] + "\n " + "12:" + alcohol[11]);

        System.out.println(" list of brand available:");
        for (int index = 0; index <= alcohol.length - 1; index++) {
            System.out.println(alcohol[index]);


        }

    }
}
