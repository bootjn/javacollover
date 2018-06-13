package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaCollectionsOverview {

    public static void main(String[] args) {
	// write your code here
        //System.out.print("what's your favorite movie or book?: ");
        ArrayList<String> favorite = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        //String userinput = keyboard.next();
        //favorite.add(userinput);

        //System.out.print(favorite);

        boolean loop = true;
        while (loop == true) {
            System.out.print("what's your favorite movie or book?: ");
            String userinput = keyboard.next();
            favorite.add(userinput);

            //System.out.print(favorite);
            System.out.print("continue? y,n: ");
            String contin = keyboard.next(); // continue
            if (contin.equals("n")) {
                loop = false; //==!
            }
        }
        System.out.print(favorite);
    }
}
