/*
 * Descriprion: Excercise 6, chapter 2
 * Write a class that declares a variable named inches, which holds a length in inches and assigns a value in feet and inches; 
 * for example 86 inches becomes 7 feet and 2 inches. 
 * Be sure to use a named constant where appropriate. Save the class as InchestoFeet.Java
 */
import java.util.Scanner;
 class InchestoFeetInteractive {
    public static void main(String[] arg){
        int inchesInput; //input
        final int feetInAnInch =  12; //feet constant
        Scanner inD = new Scanner(System.in);
        System.out.print("Enter Inches: ");
        inchesInput = inD.nextInt();
        inD.nextLine();
        inD.close();
        System.out.println("--Results--\nFeet: " + (inchesInput/feetInAnInch)+"\nInches: "+ (inchesInput%feetInAnInch));
    }
    
}
