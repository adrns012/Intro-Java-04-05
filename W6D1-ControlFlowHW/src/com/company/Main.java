package com.company;

import java.util.*;
class AsciiChars
{
    public static void printNumbers(){
        // prints valid numeric numebrs
        System.out.print("\nThe one digit integers are: ");
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
    }
    public static void printLowerCase(){
        // prints valid lovercase alphebets
        System.out.print("\nThe lower case English alphabet is as follows: ");
        for(char ch='a';ch<='z';ch++){
            System.out.print(ch + " ");
        }
    }
    public static void printUpperCase(){
        // prints valid lovercase alphebets
        System.out.print("\nThe upper case English alphabet is as follows: ");
        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch + " ");
        }
    }
}
    public class Main {
    public static void main(String[] args) {
        // calling the static methods of class AsciiChars
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner sc = new Scanner(System.in);
        String continueOption;
        // simple interaction
        System.out.print("\nPlease enter your name here: ");
        String name = sc.next();
        System.out.println("Hello "+name);
        System.out.print("If you would like to continue, please enter 'y', otherwise please enter 'n': ");
        String option = sc.next();
        if(option.equals("yes") || option.equals("y")){
            do{

                // continue to the interaction
                System.out.println("Great! You can can continue to use 'Y' to answer yes and 'n' to answer no.");
                System.out.print("Do you own a red car?(Yes / No): ");
                String redCar = sc.next();

                System.out.print("What's the name of your favorite pet: ");
                String petName = sc.next();

                System.out.print("What's the age of your favorite pet: ");
                int petAge = sc.nextInt();

                System.out.print("What's your lucky number: ");
                int luckyNum = sc.nextInt();

                System.out.print("Do you have a favorite quarterback? (Yes / No): ");
                option = sc.next();
                int jerseyNum = 0;
                if(option.equals("yes") || option.equals("y")){
                    System.out.print("What is their jersey number: ");
                    jerseyNum = sc.nextInt();
                }

                System.out.print("What is the two digit model year number of your vehicle?: ");
                int modelYear = sc.nextInt();

                System.out.print("What is the first name of your factor actor or actress?: ");
                String actressFirstName = sc.next();


                System.out.print("Enter a random number between 1 and 50: ");
                int randomNumber = sc.nextInt();

                // Generating output
                Random rand = new Random();
                int magicBallNum;

                int rand1 = rand.nextInt(50);
                int rand2 = rand.nextInt(50);
                int rand3 = rand.nextInt(50);
                if((rand.nextInt(2) == 1) && (jerseyNum != 0) ) {
                    // choose the jersey number; else choose the lucky number
                    magicBallNum = jerseyNum * rand1;
                }
                else{
                    magicBallNum = luckyNum * rand1;
                }
                if(magicBallNum > 75){
                    // substract 75 from it
                    magicBallNum = magicBallNum - 75;
                }
                //    generate other 5 numbers
                int num1 , num2, num3, num4, num5;
                // Choosing the options =  modelNumber + luckyNumber

                num1 =  modelYear + luckyNum;
                // checking if the numbers are in range
                if(num1>65)
                    num1 = num1 - 65;
                if(num1<1)
                    num1 = num1 + 65;
                // choosing the options =  random numbers between 1 a
                //
                // nd 50 and subtract rand2
                num2 =  rand2 - rand.nextInt(50);
                // checking if the numbers are in range
                if(num2>65)
                    num2 = num2 - 65;
                if(num2<1)
                    num2 = num2 + 65;
                // choosing the options =  use a value 42
                num3 =  42;

                // choosing the options = age of the favorite pet + model year
                num4 =  petAge + modelYear;
                // checking if the numbers are in range
                if(num4>65)
                    num4 = num4 - 65;
                if(num4<1)
                    num4 = num4 + 65;
                // choosing the options =  first letter of favoriate actress
                num5 =  (int)actressFirstName.charAt(0);
                // checking if the numbers are in range
                if(num5>65)
                    num5 = num5 - 65;
                if(num5<1)
                    num5 = num5 + 65;
                System.out.print("\nLottery numbers: ");
                System.out.print(num1+", ");
                System.out.print(num2+", ");
                System.out.print(num3+", ");
                System.out.print(num4+", ");
                System.out.print(num5+", ");
                System.out.print(" Magic ball: "+magicBallNum);
                System.out.println("\nWould you like to generate another set of numbers? (Yes / No)?: ");
                continueOption = sc.next();

            } while(continueOption.equals("yes"));
        }
        else {
            System.out.println("\nProgram restarting...A");
        }
        System.out.println();
    }

}