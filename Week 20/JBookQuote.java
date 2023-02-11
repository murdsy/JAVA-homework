/*
 * Write an application that displays a JFrame 
 * containing the opening sentence or two from your 
 * favorite book. Save the file as JBookQuote.java.
 */
import java.awt.*;
import javax.swing.*;
public class JBookQuote {
    public static void main(String[] args){

        JLabel quote = new JLabel();
        quote.setText("Insert Book Quote");
        JLabel bro = new JLabel();
        bro.setText("Insert da author here");

        quote.setHorizontalAlignment(JLabel.CENTER);
        quote.setVerticalAlignment(JLabel.TOP);
        Font f1 = new Font(Font.SANS_SERIF, Font.BOLD, 25);
        quote.setFont(f1);
        quote.setForeground(Color.DARK_GRAY);

        bro.setHorizontalAlignment(JLabel.CENTER);
        bro.setVerticalAlignment(JLabel.CENTER);
        Font f2 = new Font(Font.DIALOG_INPUT, Font.ITALIC, 15);
        bro.setFont(f2);

        JFrame frame = new JFrame("Book Quotes");
        JPanel panel = new JPanel();
        frame.setSize(420,420); //x,y
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        panel.setBackground(Color.GREEN);
        panel.add(quote);
        panel.add(bro);
        
        frame.add(panel);

        
    }
    
}