//package Stringjet;
import java.util.Scanner;

public class KrahasoStringjetMeBarazim {

    public static void main(String[] args){
    String s1 = "Mary"; 
    String s2;
    Scanner in=new Scanner(System.in);
    System.out.print("Jepni emrin tuaj: ");
    s2 = in.nextLine();
    if(s1==s2)
        System.out.println("Jane te barabarta!");
    else
        System.out.println("Nuk jane te barabarta!");
    }
}
