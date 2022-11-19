//- Modifikoni ushtrimin 7 qe metodat te kthejne vlere.

import java.util.Scanner;

class MetricConversionMod{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int user = in.nextInt();

        System.out.println(user+" inch = "+ ConvertCm(user) + " cm s");
        System.out.println(user+" gallon = "+ ConvertL(user) + " liters");



    }

    public static double ConvertCm(int n){
        //inch to centimeter
        double con =  n*2.54;
        return con;
    }
    public static double ConvertL(int n){
        //inch to centimeter
        double con  = n*3.7854;
        return con;
    }
}

