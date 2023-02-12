/*
 * Create an application with a JFrame and at least five labels 
 * that contain interesting historical facts. Every time the 
 * user clicks a JButton, remove one of the labels and add
a different one. Save the file as JHistoricalFacts.java
 */
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JHistoriacFacts {

    

    public static void main(String[] args){
        
        Random rand = new Random();

        String[] hisfacts = {"Ketchup was once sold as a medicine",
                    "Ice pops were accidentally invented by a kid! ",
                    "Iceland has the world's oldest parliament.",
                     "Dunce caps used to be signs of intelligence.",
                    " A horse became a Senator in Ancient Rome.",
                    "Buzz Aldrin was the first to pee on the moon.", 
                     "More than 75 million Europeans were killed by rats in the Middle Ages.",
                    "Napoleon Bonaparte was attacked by a horde of bunnies. "
        };

        JFrame frame = new JFrame("Historical Facts :3");
        
        // Declaring the buttons, panels, etc...
        JButton button = new JButton("Click");
        JLabel label = new JLabel();
       
        label.setText(hisfacts[rand.nextInt(8)]);
        label.setVisible(false);
       

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(label.isVisible()==true){
                    label.setVisible(false);
                    label.setText(hisfacts[rand.nextInt(8)]);
                    label.setVisible(true);
                }
                else if(label.isVisible() == false)
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
