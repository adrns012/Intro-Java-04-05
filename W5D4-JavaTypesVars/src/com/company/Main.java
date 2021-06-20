package com.company;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.util.Scanner;

public class Main {


        public static void main (String[]args){

        Scanner userInput = new Scanner(System.in);

        String greeting = "Hello There";
        String start = "Welcome to my world...";
        System.out.println(start);
        System.out.println("Now, kindly please enter your name:");
        String name = userInput.nextLine();
        System.out.printf("Greetings %s\n", name);
        String intro = "Im so glad you're here to experience my first written Java code!";
        System.out.println("Let's learn some more about you,");
        System.out.println("starting with, lets say your age.");
        System.out.println("Please enter your age here:");
        String age = userInput.nextLine();

        System.out.println("And whats that first character of your last name?");
        String lastI = userInput.nextLine();
        System.out.printf("Cool, so then to be clear, your name is %s,, last initial %s, and you're the age of %s!", name, lastI, age);
        System.out.println("\nLoading...");
        System.out.println("......");
        System.out.println("............");
        System.out.println("........................");
        System.out.println("................................................");
        System.out.println("Done! IP Address has been logged. 192.168.2.257");
        System.out.println("Thank you come again!");


        // write your code here
    }
}
