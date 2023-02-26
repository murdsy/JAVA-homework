import java.util.Scanner;

public class TestCharacter {

    public static void main(String[] args){
        char aChar;
        String aString;
        Scanner in = new Scanner(System.in);
        System.out.print("Jepni nje karakter ... ");
        aString = in.nextLine();
        aChar = aString.charAt(0);

        System.out.println("Karakteri eshte "+aChar);
        if(Character.isUpperCase(aChar))
            System.out.println("Karakteri eshte "+aChar);
        else
            System.out.println(aChar+" nuk eshte germe kapitale");

        if(Character.isLowerCase(aChar))
            System.out.println(aChar + " eshte germe e vogel");
        else
            System.out.println("nuk eshte germe e vogel"); 
            
        aChar = Character.toLowerCase(aChar);
        System.out.println("Pas toLowerCase(), aChar behet " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("Pas toUpperCase(), aChar behet " + aChar);

        if(Character.isLetterOrDigit(aChar))
            System.out.println(aChar + " eshte germe ose numer");
        else
            System.out.println(aChar + " nuk eshte as germe as numer");
        if(Character.isWhitespace(aChar))
            System.out.println(aChar + " eshte hapesire");
        else
            System.out.println(aChar + " nuk eshte hapesire");



    }
    
}
