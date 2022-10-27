/* Shkruani nje program qe llogarit dhe afishon katrorin
 e nje numri te dhene nga tastiera duke perdorur metodat 
 me parametra qe kthejne vlere. Te perseritet 
leximi i numrit deri sa numri i dhene te jete -9999.*/
import java.util.Scanner;
import java.lang.Math;
public class detyreklase3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 0;
        while(n != -9999){
            System.out.print("\nVendos nje nr. per te gjetur katortin (shtyp -9999 per te ndaluar programin)");
            n = in.nextInt();
            if(n!=-9999) 
            System.out.println("Katrori i numrit eshte: "+ katrori(n));  //e vura if qe nese vihet -9999 te mos beje function. 
        }
        
        in.close();
    }
    
    public static double katrori(int n){
        double pergjigje = Math.sqrt(n);
        return pergjigje;
    }
}
