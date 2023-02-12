/*
 * Modify the JFrameDisableButton program so that the JButton is not disabled
until the user has clicked at least eight times. At that point, display a JLabel that
 indicates That’s enough!. Save the file as JFrameDisableButton2.java
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class JFrameDisableButton2 {
    static int count =0;
    public static void main(String[] args){
       
            JFrame frame = new JFrame("Diable button omg");
            
            // Declaring the buttons, panels, etc...
            JButton button = new JButton("Click me");
            JLabel label = new JLabel("Click the button!");
            label.setVisible(true);
    
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    count++;
                    if(count >=8){
                        button.setEnabled(false);
                        label.setVisible(false);
                        label.setText("Thats enough!");
                        label.setVisible(true);
                    }
                    
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
