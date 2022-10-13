/*
 * Shkruani nje program ne Java qe lexon nje numer te plote nga tastiera 
 * dhe afishon numrin e kundert. Psh nese japim 123456 te afishohet 654321.
 */
public class kundert {
    public static void main(String[] arg){
        String nr = new String("123456");
        int i=0;
        for(i=nr.length()-1; i>=0; i--){
            System.out.print(nr.charAt(i));
        }
    }
}
