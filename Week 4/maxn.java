/*
 * Shkruani nje program qe lexon nga tastiera n numra te plote dhe gjen maksimumin e tyre. Programi te nderpritet kur jepet nga tastiera numri -1.\
 */
import java.util.Scanner;
 
public class maxn {
    public static void main(String[] arg){
        int n = 0;
        int nrmax=0;
        Scanner i = new Scanner(System.in);
        do{     
            System.out.print("Vendos nje nr. ");
            n = i.nextInt();
            if(n>nrmax){
                nrmax = n;
            }
        }
        while(n !=-1);
        System.out.print("Nr. Max="+nrmax);
    }
}
