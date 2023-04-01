/*Create a JFrame that uses BorderLayout. Place a JButton in the center region.
Each time the user clicks the JButton, change the background color in one of the
other regions. Save the file as JColorFrame.java.*/

import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import javax.swing.*;

public class JColorFrame extends JFrame implements ActionListener{
    private JFrame frame = new JFrame();
    private JButton button = new JButton();

    public JColorFrame(){
        super();
        frame.setLayout(new BorderLayout());
        add(button, BorderLayout.CENTER);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        
    }

    public static void main(String[] args){

    }
}
