/*The Harrison Group Life Insurance company computes annual policy premiums
based on the age the customer turns in the current calendar year. The premium is
computed by taking the decade of the customer’s age, adding 15 to it, and multiplying
by 20. For example, a 34 year old would pay $360, which is calculated by adding the
decades (3) to 15, and then multiplying by 20. Write an application that prompts a
user for the current year and a birth year. Pass both to a method that calculates and
returns the premium amount, and then display the returned amount. Save the
application as Insurance.java.
*/
import java.util.Scanner;
public class Insurance {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter Current Year, then Birth Year: ");
       int current = in.nextInt();
       int birth = in.nextInt();
       in.close();

       System.out.println("Your premium for this year is: "+ premium(current, birth));
    }
    public static int premium(int currentYear, int birthYear){
        int age = currentYear-birthYear;
        //premium = decade+15*20
        int premium = ((age/10)+15)*20;
        return premium;
    }
}
