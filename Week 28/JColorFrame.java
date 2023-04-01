/*Create a JFrame that uses BorderLayout. Place a JButton in the center region.
Each time the user clicks the JButton, change the background color in one of the
other regions. Save the file as JColorFrame.java.*/

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class JColorFrame extends JFrame implements ActionListener{
    private JFrame frame = new JFrame();
    private JButton button = new JButton();
    //private Color color = new Color();
    JPanel n = new JPanel();
    JPanel w = new JPanel();
    JPanel east = new JPanel();
    JPanel s = new JPanel();
   
    Random rand = new Random();
    final int pHeight  = 50, pWidth = 150; 

    public JColorFrame(){
        super();
        frame.setLayout(new BorderLayout( 50, 50));
        //button.setPreferredSize(new Dimension(150,50));
        add(button, BorderLayout.CENTER);
        add(n, BorderLayout.NORTH);
        add(w, BorderLayout.WEST);
        add(east, BorderLayout.EAST);
        add(s, BorderLayout.SOUTH);
        
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        //1 - north, 2-west, 3-east, 4-south
        int position = rand.nextInt(4) + 1;
        int red = rand.nextInt(255);
        int green = rand.nextInt(255);
        int blue = rand.nextInt(255);

        switch(position){
            case 1:
                n.setBackground(new Color(red,green,blue));
                break;
            case 2:
                w.setBackground(new Color(red,green,blue));
                break;
            case 3:
                east.setBackground(new Color(red,green,blue));
                break;
            case 4:
                s.setBackground(new Color(red,green,blue));
                break;
        }

    }

    public static void main(String[] args){
        final int WIDTH = 450, HEIGHT = 250;
        JColorFrame f = new JColorFrame();
        f.setSize(WIDTH, HEIGHT);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
