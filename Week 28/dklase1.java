/*Shkruani nje aplikacion ne Java qe 
shfaq nje JFrame qe permban 3 JButton me tekste 
Red, Green dhe Blue. Sa here qe klikohet secili
buton rrit me 10 intensitetin e ngjyres perkatese.
Nese vlera e kalon 255 duhet te rifilloje perseri 
nga 0. */


import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import javax.swing.*;

public class dklase1 extends JFrame implements ActionListener{
    private JFrame frame = new JFrame();
    private JButton bred = new JButton("Red: 0");
    private JButton bgreen = new JButton("Green: 0");
    private JButton bblue = new JButton("Blue: 0");
    private int r=0, g=0, b=0;
    //final int WIDTH = 350, HEIGHT = 200;
    private JPanel panel = new JPanel();
    public dklase1(){
        
        super();
        frame.setLayout(new FlowLayout());
        //frame.setSize(WIDTH, HEIGHT);
        panel.add(bred);
        panel.add(bgreen);
        panel.add(bblue);
        add(panel);
        bred.addActionListener(this);
        bgreen.addActionListener(this);
        bblue.addActionListener(this);
        panel.setBackground(new Color(r,g,b));
        }

        public void actionPerformed(ActionEvent e) { 
            Object source = e.getSource();
            if(source == bred){
                r+=10;
                if(r>255)
                    r=r-255;
                bred.setText("Red: "+r);
                panel.setBackground(new Color(r,g,b));
            }
            if(source == bgreen){
                g+=10;
                if(g>255)
                    g=g-255;
                bgreen.setText("Green: "+g);
                panel.setBackground(new Color(r,g,b));
            }
            if(source == bblue){
                b+=10;
                if(b>255)
                    b=b-255;
                bblue.setText("Blue: "+b);
                panel.setBackground(new Color(r,g,b));
                
            }

       
    }


    public static void main(String[] args){
        final int WIDTH = 350, HEIGHT = 200;
        dklase1 frame = new dklase1();
        frame.setVisible(true);
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}