package com.company;
import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {

        Shop Shop = new Shop("E.G.", "Miami", 2021);

        Shop.getProduct();
        Shop.getLocation();
        Shop.getOpeningYear();

        Shop.setProduct("Chewies");
        Shop.setOpeningYear(2021);
        Shop.setLocation("Miami, FL");

        Shop.isNewStore();

        Pet Pet = new Pet("Marley", "Miami", "Dog", 7);

        Pet.getAge();
        Pet.getName();
        Pet.getType();

        Pet.setName("Marley");
        Pet.setAge(7);
        Pet.setLocation("Miami, FL");

    }


}
