package com.company;

import java.util.Scanner;
public class calculator
{

    public static void main(String[] args)
    {
        //User Input
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for adding - 2 for subtracting -  3 for multiplication - 4 for dividing - 5 for your first number to be squared:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
            case 1:
                System.out.println(add( num1,num2));
                break;
            case 2:
                System.out.println(sub( num1,num2));
                break;
            case 3:
                System.out.println(mult( num1,num2));
                break;
            case 4:
                System.out.println(div( num1,num2));
                break;
            case 5:
                System.out.println(squared( num1));
                break;
            default:
                System.out.println("Illegal Operation");


        }



    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
    public static int squared(int x)
    {
        int result = x*x;
        return result;
    }


}