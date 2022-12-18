/*
 * 3. a. Create a program that contains a String that holds your favorite movie quote and
display the total number of spaces contained in the String. Save the file as
CountMovieSpaces.java.
 * 
 */

import java.util.Scanner;

class CountMovieSpaces{
    public static void main(String[] args){
        String quote = "this is a random quote";
        //Scanner in = new Scanner(System.in);
        int spaceCount = 0;

        //System.out.print("Put your fav movie quote: ");
        //quote = in.nextLine();

        for(int i = 0; i<quote.length();i++){
            if(quote.charAt(i) == ' ')
                spaceCount++;
        }

        System.out.println("There are "+spaceCount+" spaces in this quote!");
    }
}