/*Create an educational program for children that 
distinguishes between vowels and consonants as the
 user clicks buttons. Create 26 JButtons, each labeled 
 with a different letter of the alphabet. Create a 
 JFrame to hold three JPanels in a two-by-two grid. Randomly 
 select eight of the 26 JButtons and place four in each of 
 the first two JPanels. Add a JLabel to the third JPanel. 
 When the user clicks a JButton, the text of the JLabel 
 identifies the button’s letter as a vowel or consonant, 
 and then a new randomly selected letter replaces the 
 letter on the JButton. Save the file as JVowelConsonant.java. */

 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;

 public class JVowelConstant extends JFrame implements ActionListener{
    private JFrame f = new JFrame();
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    private JLabel label = new JLabel();
    private JPanel PANEL = new JPanel();
    private String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    public JVowelConstant(){
        
    }
    
    public static void main(String[] args){

    }
}
