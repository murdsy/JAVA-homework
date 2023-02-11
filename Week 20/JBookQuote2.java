/*
 *  Add a button to the frame in the JBookQuote program.
 *  When the user clicks the button, display the title 
 * of the book that contains the quote. Save the file as JBookQuote2.java
 */
import java.awt.*;
import javax.swing.*;
public class JBookQuote2 extends JFrame {

    JBookQuote2(){
        this.setTitle("Book Quotes 2");
        this.setSize(420,420); //x,y
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.GREEN);
    }

    public static void main(String[] args){
        new JBookQuote2();
    }

}
