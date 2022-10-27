/*
 * b. Modify the Percentages class to accept the values of the two doubles from a user
at the keyboard. Save the file as Percentages2.java.
 */
import java.util.Scanner;
public class Percentages2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Input 2 double values: ");
        double first = in.nextDouble();
        double second = in.nextDouble();

        in.close();
        
        computePercent(first, second);
    }

    public static void computePercent(double one, double two){
        System.out.println(one + " is " + (one/two)*100 + " percent of "+two);
    }
}