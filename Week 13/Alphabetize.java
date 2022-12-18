/*
 * 6. a. Write an application that accepts three Strings from the user and displays one of
two messages depending on whether the user entered the Strings in alphabetical
order without regard to case. Save the file as Alphabetize.java.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Alphabetize {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String inputs[] = new String[3];
        String inputsb4[] = new String[3];
        int alphcount = 0;

        inputsb4=inputs;

        System.out.println("put three strings.:");

        for(int i=0; i<3; i++){
            inputs[i] = in.nextLine();
        }

        Arrays.sort(inputs);

        for(int i=0; i<3; i++){
            if(inputsb4[0] == inputs[0])
                alphcount++;
            
        }

        if(alphcount == 3)
        System.out.println("Jane ne rregull alfabetik.");
        else
        System.out.println("nuk jane ne rregull alfabetik.");

    }
}
