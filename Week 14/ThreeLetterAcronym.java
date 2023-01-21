/*
 * Three-letter acronyms are common in the business world. For example, inJava you use the 
 * IDE(Integrated Development Environment) in the JDK (Java Development Kit)
 *  to write programs used by the JVM (Java Virtual Machine) that you might send over 
 * a LAN(local area network).Programmers even use the acronym TLA to stand for three-letter acronym. 
 * Write a program that allows a user to enter three words, and display the appropriate 
 * three-letter acronym in all uppercase letters. If the user enters more than three words, 
 * ignore the extra words. Save the file as ThreeLetterAcronym.java.
 */
import java.util.Scanner;
public class ThreeLetterAcronym {
    public static void main(String[] arg){
        //get input first
        //skam bere shume update so gotta do this lol
        System.out.print("Enter three words: ");
        String s1, s2, s3;
        Scanner in = new Scanner(System.in);
        s1 = in.nextLine();
        s2 = in.nextLine();
        s3 = in.nextLine();
        in.close();
        System.out.println(s1.charAt(0)+""+s2.charAt(0)+""+s3.charAt(0));
    }
}
