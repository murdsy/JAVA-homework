/*
 * Write an application that determines whether a phrase entered 
 * by the user is a palindrome. A palindrome is a phrase that reads the 
 * same backward and forward without regarding capitalization or punctuation. 
 * For example, “Dot saw I was Tod”, “Was it a car or a cat I saw?”, 
 * and “Madam, I’m Adam” are palindromes. Save the file as Palindrome.java.
 */
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Palindrome {
    public static void main(String[] arg){
        //getting user input
        System.out.print(" Give a string to test if it is a palindrome: ");
        Scanner in = new Scanner(System.in);
        String lol = in.nextLine();
        //lets analyze the string
        //remove special characters and spaces
        lol = lol.replaceAll("\\p{Punct}", "");
        lol = lol.replaceAll(" ","");
        //make all upcase for easier comparison
        lol = lol.toUpperCase();

        int palindromeCount=0, length = lol.length();

        //compare the string
        for(int i=0; i<length;i++){
            if(lol.charAt(i) == lol.charAt((length-1) - i)) 
                palindromeCount++;
        } //results
        if(palindromeCount == length)
            System.out.println("Its a palindrome!!");
        else 
            System.out.println("It is not a palindrome!!");

        in.close();

    }
}
