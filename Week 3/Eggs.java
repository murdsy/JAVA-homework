/*
 * Description:  Meadowdale Dairy Farm sells organic brown eggs to local customers. They charge
$3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen.
Write a class that prompts a user for the number of eggs in the order and then display
the amount owed with a full explanation. For example, typical output might be, “You
ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each
for a total of $7.85.” Save the class as Eggs.java
 */
import java.util.Scanner;
public class Eggs {
    public static void main(String[] arg){
        double dozenPrice = 3.25;
        double loosePrice = 0.45;

        Scanner inD = new Scanner(System.in);

        System.out.print("Select how many eggs you need: ");
        int eggs = inD.nextInt();
        inD.close();

        double total = (eggs/12)*dozenPrice + (eggs%12)*loosePrice;

        System.out.print("Your total with "+ (eggs/12) + " dozens and "+ (eggs%12)+ " loose eggs is "+ total);
    }
}
