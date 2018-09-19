package com.company.java;

import java.util.Scanner;

public class UserInputConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // While loop
        int count = 0;
        while(count < 15){
            System.out.println("Please enter a value: ");
            int userinput = input.nextInt();
            double millimeter = userinput * 25.4;
            System.out.println(userinput + " inches = " +  millimeter +
                    " millimeter");
            count++;
        } // End while

        // Do while loop
        System.out.println(); // prints an empty line
        int count1 = 0;
        System.out.println("Do while");
        do {
            System.out.println("Please enter a value: ");
            int userinput2 = input.nextInt();
            double millimeter = userinput2 * 25.4;
            System.out.println(userinput2 + " inches = " +  millimeter +
                    " millimeter");
            count1++;
        }while (count1 < 15); // End do while


        // For loop
        System.out.println();
        System.out.println("For loop");
        for (int i = 0; i < 15 ; i++) {
            System.out.println("Please enter a value: ");
            int userinput3 = input.nextInt();
            double millimeter = i * 25.4;
            System.out.println(userinput3 + " inches = " +  millimeter +
                    " millimeter");
        }// End for
    }
}
