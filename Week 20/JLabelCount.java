import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JLabelCount {
    static int count = 0;
    public static void main(String[] args){
        
      
        
        JFrame frame = new JFrame("Book Quotes 2");
        
        // Declaring the buttons, panels, etc...
        JButton button = new JButton("Click me");
        JLabel label = new JLabel("Click the button!");
        label.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                count++;
                label.setText("Omg you clicked this button "+ count + " times !");
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