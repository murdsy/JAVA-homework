/*Write an application that prompts the user for three first names 
and concatenates them in every possible two-name combination so that 
new parents can easily compare them to find the most pleasing baby name. 
Save the file as BabyNameComparison.java.
 */

import java.util.Scanner;
public class BabyNameComparison{
    public static void main(String[] arg){
        //aquire the strings
        //we will put them in arrays.
        String[] arr = new String[3];
        System.out.print("Enter 3 strings: ");
        Scanner in = new Scanner(System.in);
        arr[0] = in.nextLine();
        arr[1] = in.nextLine();
        arr[2] = in.nextLine();

        //we print out the possibilites
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i!=j)
                    System.out.println(arr[i]+arr[j]);
                
            }
        }

        in.close();
    }
}