package com.xworkz.zomatoapp;

public class ZomatoTester {
    public static void main(String[] args) {
        DeliveryBoys boy = new DeliveryBoys();
        Zomato zomato = new Zomato(boy);
        Zomato.boys.toDeliverFood();
    }
}
