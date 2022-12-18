import java.util.Arrays;
import java.util.Scanner;

public class Alphabetize2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String inputs[] = new String[3];


        System.out.println("put three strings.:");

        for(int i=0; i<3; i++){
            inputs[i] = in.nextLine();
        }

        Arrays.sort(inputs);

        for(int i=0; i<3; i++){
            System.out.println(inputs[i]);
        }


    }}

