/*
 * Description:
 * Write a Java class that declares a named constant 
 * to hold the number of quarts in a gallon. 
 * Also declare a variable to represent
 * the number of quarts needed for a painting job, 
 * and assign an appropriate value- for exapmple, 18. 
 * Compute and display the number of gallons and quarts needed 
 * for the job. Display explanatory text with the values
 * - for example, A job that needs 18 quarts requires 4 gallons plus 2 quarts.
 * 
 * Convert to an interactive application. 
 */
import java.util.Scanner;

class quartersToGallonInteractive {
    public static void main(String[] arg){
        final int QUARTSINAGALLON = 4;
        Scanner inD = new Scanner(System.in);

        System.out.print("Give the quarts needed for your paint job: ");

        int nrOfQuarts = inD.nextInt();
        
        inD.close();

        System.out.println("You are needed: \n"+(nrOfQuarts/QUARTSINAGALLON)+" Gallons\n"+(nrOfQuarts%QUARTSINAGALLON)+" Quarts");
    }
    
}
