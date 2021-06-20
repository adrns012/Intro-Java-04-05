package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // array declared
        ArrayList<Double> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // scanner user input
        for(int i = 0; i < 5; i++) {
            System.out.println("Please, slowly give me 5 zesty numbers..." + "\n#" + (i + 1));
            list.add(sc.nextDouble());
        }

        // variable / value (declarations)
        double sum = 0, product = 1, largest = list.get(0), smallest = list.get(0);

        for(int i = 0; i < 5; i++) {
            sum += list.get(i); // get that adds up user inputs
            product *= list.get(i); // get that multiplies selected of all user values with self

            largest = Math.max(largest, list.get(i)); // get that returns the largest value in the array
            smallest = Math.min(smallest, list.get(i)); // get that returns the smallest value in the array
        }
        // Print  all of the calculated values
        System.out.println("The sum of the numbers is:" + sum);
        System.out.println("The product of the numbers is: " + product);
        System.out.println("The largest is number is: " + largest);
        System.out.println("The smallest is numbers is: " + smallest);
    }
}