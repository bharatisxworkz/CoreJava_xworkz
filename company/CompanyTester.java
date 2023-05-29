package com.xworkz.company;

public class CompanyTester {
    public static void main(String[] args) {
        Brand brands = new Brand();
        Company company = new Company(brands);
        Company.brand.toDoBussiness();
    }
}
