/*
 *  Write an application that counts the words in a String entered by a user. Words are
separated by any combination of spaces, periods, commas, semicolons, question
marks, exclamation points, or dashes. Figure 7-17 shows two typical executions. Save
the file as CountWords.java.

 */
import java.util.Scanner;

class CountWords{
    public static void main(String[] args){
        String input;
        Scanner in = new Scanner(System.in);
        int wordCount = 0;

        System.out.print("Put a sentence, nuk lejohet hapsira mbas pikes,presjes,pikpyetjes etj.: ");
        input = in.nextLine();

        for(int i = 0; i<input.length();i++){
            if(input.charAt(i) == ' ' || input.charAt(i) == ',' || input.charAt(i) == '.'  || input.charAt(i) == '?'  || input.charAt(i) == ';' || input.charAt(i) == '!')
                wordCount++;
        }
        //i shtojme 2 word count, 1 per fjalen ne fillim nje per ate ne fund
        System.out.println("There are "+(wordCount+2)+" words in this string!");
    }
}