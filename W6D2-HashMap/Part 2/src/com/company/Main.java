package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // [Key:Value] = [Model:Make]
        HashMap<String, ArrayList<String>> vehicles = new HashMap<String, ArrayList<String>>();

        vehicles.put("Ford", new ArrayList<>(Arrays.asList("Bronco", "Explorer", "Ranger")));
        vehicles.put("Subaru", new ArrayList<>(Arrays.asList("WRX", "Impreza", "Ascent")));
        vehicles.put("Honda", new ArrayList<>(Arrays.asList("Civic", "Civic-SI", "Type R")));
        vehicles.put("Toyota", new ArrayList<>(Arrays.asList("Tundra", "Tacoma", "Rav4")));
        vehicles.put("Jeep", new ArrayList<>(Arrays.asList("Grand Cherokee", "Renegade", "Wrangler 4xe")));


        // user input scanner
        Scanner sc = new Scanner(System.in);



        // user input scan
        System.out.println("Which brand car manufacturer are you interested in today?");
        String input = sc.nextLine();



        if(vehicles.containsKey(input)) {
            System.out.println("So, you're looking for a " + input + ", huh?" + " We have those right here!" );


            ArrayList<String> list = vehicles.get(input);


            for (String make: list) {
                System.out.println("Make: " + input + " |" + " Model: " + make);
            }// if fulfilled (inventory = true), print entire map of car manufacturer
        }else {

            System.out.println("We're sorry, but we currently do not have any " + input + " vehicles in our inventory.");
            System.out.println("Please contact us for further details!");
        } // tough luck
    }
}
