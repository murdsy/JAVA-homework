/*
 * Shkruani nje program qe lexon rrogen bruto dhe interesin dhe afishon 
 * rrogen neto. Programi te krijohet per afishimin ne console dhe me pas ne GUI.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class rroganet {
   public static void main(String[] arg){
        
    int rrogabruto;
    float perqindjaInteresit;
    float rroganet;

    Scanner lol = new Scanner(System.in);
    
    System.out.println("Vendosni rrogen tuaj bruto: ");
    rrogabruto = lol.nextInt();
    System.out.println("Vendosni perqindjen e interesit: ");
    perqindjaInteresit = lol.nextFloat();
    lol.nextLine();
    lol.close();

    rroganet = (1-(perqindjaInteresit/100))*rrogabruto;

    JOptionPane.showMessageDialog(null, "Rroga juaj neto eshte: "+rroganet );
   
    } 
    
}
