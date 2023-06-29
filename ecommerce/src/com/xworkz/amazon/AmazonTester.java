package com.xworkz.amazon;

import java.util.Scanner;

public class AmazonTester {
    public static void main(String args[]){
        System.out.println("Main invoked");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of product to be selected");
        int size = sc.nextInt();
        Ecommerce ecommerce = new Ecommerce(size) {

            @Override
            public boolean addProduct(AmazonProduct product) {
                return false;
            }

            @Override
            public void getAllProduct() {

            }for(int productIndex = 0; productIndex < size; productIndex++)  {
          AmazonProduct amazonProduct = new AmazonProduct();

          System.out.println("enter product Id");
          amazonProduct.setProductId(sc.nextInt());

        }

    }
}
