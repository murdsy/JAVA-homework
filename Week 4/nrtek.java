/*
 * Shkruani nje program qe lexon nga tastiera nje numer tek per te vazhduar ose 999 per te ndaluar.
 *  Kur perdoruesi shtyp numrin tek afishohet Numer tek!. Nese perdoruesi jep numer cift afishohet
 *  nje mesazh gabimi dhe pyetet perdoruesi per nje numer tjeter.
 *  Nese perdoruesi shtyp 999 programi perfundon. Ruani programin si NumratTekCikel.java
 */
import java.util.Scanner;

public class nrtek {
    public static void main(String[] arg){
        int nrTek= 1;
        Scanner uh = new Scanner(System.in);
        
        do{
            System.out.print("Vendos nje numer tek ose 999 per tu larguar.");
            nrTek = uh.nextInt();
            if(nrTek%2==0)
                System.out.println("Gabim, duhet te jete nr tek!");
            if(nrTek%2==1){
                if(nrTek != 999)
                    System.out.println("Nr. Tek");
            }
        }
        while(nrTek != 999);
        
        uh.close();
        System.out.println("Programi u mbyll!");
    }
    
}
