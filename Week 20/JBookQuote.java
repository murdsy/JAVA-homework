/*
 * Write an application that displays a JFrame 
 * containing the opening sentence or two from your 
 * favorite book. Save the file as JBookQuote.java.
 */
import java.awt.*;
import javax.swing.*;
public class JBookQuote {
    public static void main(String[] args){
        JFrame frame = new JFrame("Book Quotes");
        frame.setSize(420,420); //x,y
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GREEN);
    }
    
}
