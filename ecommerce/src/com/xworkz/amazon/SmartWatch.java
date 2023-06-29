package com.xworkz.amazon;

public class SmartWatch extends AmazonProduct {
    AmazonProduct product[];
    int index;
    public SmartWatch(int size){
        product = new AmazonProduct[size];
    }
    public boolean addProduct(AmazonProduct product) {
        System.out.println("Invoked addProduct method");
        boolean isAdded = false;
        if (product != null) {
            System.out.println("product is selected...");
            if (product.getProductName() != null && product.getProductName.isEmpty()) {
                this.product[index] = product;
                index++;
                isAdded = true;
                System.out.println("product details added");

            } else {
                System.out.println("data is empty");
            }
        } else {
            System.out.println("product selected ");

        }
        return isAdded;
    }
    public void getAllProduct(){
    System.out.println("invoked getAllProduct method");
    System.out.println("list are:");
        for (AmazonProduct product1:this.product) {
            System.out.println(product1);


        }
    }
}
