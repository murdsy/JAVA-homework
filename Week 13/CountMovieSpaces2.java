/*
 * Write an application that counts the total number of spaces contained in a movie
quote entered by the user. Save the file as CountMovieSpaces2.java.
 */
import java.util.Scanner;

class CountMovieSpaces2{
    public static void main(String[] args){
        String quote;
        Scanner in = new Scanner(System.in);
        int spaceCount = 0;

        System.out.print("Put your fav movie quote: ");
        quote = in.nextLine();

        for(int i = 0; i<quote.length();i++){
            if(quote.charAt(i) == ' ')
                spaceCount++;
        }

        System.out.println("There are "+spaceCount+" spaces in this quote!");
    }
}
