package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 19 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        //declare the variable
        String height;
        String weight;

            System.out.print("What is your height?(inches)");
            height = userInput.nextLine();

            System.out.print("What is your weight?(pounds)");
            weight = userInput.nextLine();

            //convert to double
            double heightInt = Double.parseDouble(height);
            double weightInt = Double.parseDouble(weight);

            double bmi;
            bmi = (weightInt / (heightInt * heightInt)) * 703; //computation for bmi

            System.out.print("Your BMI is " + bmi);

            if (bmi > 18.5 && bmi < 25) { //ideal bmi

                System.out.print("\nYou are within the ideal weight range.");
            } else if (bmi > 25) { //overweight
                System.out.print("\nYou are overweight. You should see your doctor.");
            } else if (bmi < 18.5) { //underweight
                System.out.print("\nYou are underweight. You should see your doctor.");
            }

        }
    }
