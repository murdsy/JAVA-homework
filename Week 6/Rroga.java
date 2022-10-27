/*
 * 1. Te modifikohet shembulli Rrjoga.java ne menyre qe metoda 
 * RrogaERritur te marri 2 parametra
 *  (rroga dhe perqindja) dhe te ktheje vleren e rroges se re.
 * Te thirret metoda RrogaERritur nga metoda 
 * kryesore main, per dy vlera (rroga dhe perqindja) 
 * te dhena nga tastiera.
 */

import java.util.Scanner;

public class Rroga{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Jep rrogen ne nr te plote: ");
        int rroga = in.nextInt();
        System.out.print("Jep perqindjen si double, psh 20.0: ");
        double perq = in.nextDouble();

        System.out.println("\n Rritja e rroges eshte "+RrogaERritur(rroga, perq));
    }

    public static double RrogaERritur(int rroga, double perqindja){
        double rrogaerritur = rroga* (1+ (perqindja/100));
        return rrogaerritur;
    }
}