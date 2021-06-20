package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] Array = {1, 5, 6, 5, 4, 1};

        int sum = 0;
        int i;

        for (i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        System.out.println("My array is " + Arrays.toString(Array));
        System.out.println("The sum of the array is:");
        System.out.print(sum);

    }
}