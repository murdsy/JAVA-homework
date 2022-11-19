/*
 * There are 2.54 centimeters in an inch, and there are 3.7854 liters in a U.S. gallon.
Create a class named MetricConversion. Its main() method accepts an integer value
from a user at the keyboard, and in turn passes the entered value to two methods.
One converts the value from inches to centimeters and the other converts the same
value from gallons to liters. Each method displays the results with appropriate
explanation. Save the application as MetricConversion.java.

 */

import java.util.Scanner;

class MetricConversion{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int user = in.nextInt();

        Convert(user);


    }

    public static void Convert(int n){
        //inch to centimeter
        System.out.println(n+" inch = "+ (n*2.54) + " cm s");
        System.out.println(n+" gallon = "+ (n*3.7854) + " liters");

    }


}