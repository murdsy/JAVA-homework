/*
 * Create a class named TestLease whose main() method declares four Lease
objects. Call a getData() method three times. Within the method, prompt a user
for values for each field for a Lease, and return a Lease object to the main()
method where it is assigned to one of main()’s Lease objects. Do not prompt the
user for values for the fourth Lease object, but let it continue to hold the default
values. Then, in main(), pass one of the Lease objects to a showValues() method
that displays the data. Then call the addPetFee() method using the passed Lease
object and confirm that the fee explanation statement is displayed. Next, call the
showValues() method for the Lease object again and confirm that the pet fee has
been added to the rent. Finally, call the showValues() method with each of the other
three objects; confirm that two hold the values you supplied as input and one holds
the constructor default values. Save the application as TestLease.java.
 */
import java.util.Scanner;

import javax.security.sasl.SaslException;
public class TestLease {
    public static void main(String[] args){
        Lease o1 = new Lease();
        Lease o2 = new Lease();
        Lease o3 = new Lease();
        Lease o4 = new Lease();
        String input;
        int i1;
        int i2;
        int i3;
        Scanner in = new Scanner(System.in);

        //setting data for o1
        System.out.println("Input user Apt Nr, Rent,TOl,Tenant Name for object: 1");        
        i1 = in.nextInt();
        i2 = in.nextInt();
        i3 = in.nextInt();
        input = in.nextLine();
        in.nextLine();
        o1.setData(input, i1, i2, i3);

        //setting data for o2
        System.out.println("Input user Apt Nr, Rent,TOl,Tenant Name for object: 2");        
        i1 = in.nextInt();
        i2 = in.nextInt();
        i3 = in.nextInt();
        input = in.nextLine();
        in.nextLine();
        o2.setData(input, i1, i2, i3);

        //setting data for o3
        System.out.println("Input user Apt Nr, Rent,TOl,Tenant Name for object: 3");        
        i1 = in.nextInt();
        i2 = in.nextInt();
        i3 = in.nextInt();
        input = in.nextLine();
        in.nextLine();
        o3.setData(input, i1, i2, i3);

        //testing show values
        o1.showValues();
        o2.showValues();
        o3.showValues();

        o1.addPetFee();

        o4.showValues();
        o1.showValues();
        o2.showValues();
        o3.showValues();


        
    }
}
