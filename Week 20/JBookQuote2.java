/*
 * Add a button to the frame in the JBookQuote program.
 * When the user clicks the button, display the title 
 * of the book that contains the quote. Save the file as JBookQuote2.java
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JBookQuote2 {

    public static void main(String[] args){
        
      

        JFrame frame = new JFrame("Book Quotes 2");
        
        // Declaring the buttons, panels, etc...
        JButton button = new JButton("Click");
        JLabel label = new JLabel();
        label.setText("You clicked the button!");
        label.setVisible(false);

        button.addActionListener(new ActionListener() {
    
            public void actionPerformed(ActionEvent arg0) {
                label.setVisible(true);
            }
        });

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(420,420); //x,y
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setVisible(true);

    }

}
