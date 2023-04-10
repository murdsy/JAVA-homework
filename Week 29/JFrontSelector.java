/* Create a JFrame that holds five buttons with 
the names of five different fonts. Include a sixth 
button that the user can click to make a font larger
 or smaller. Display a demonstration JLabel using 
 the font and size that the user selects. 
 Save the file as JFontSelector.java. 
*/
import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrontSelector extends JFrame implements ActionListener{

    private JFrame f = new JFrame();
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    private JPanel PANEL = new JPanel();
    private JButton helvButt = new JButton("Helvetica");
    private JButton tRButt = new JButton("Times New Roman");
    private JButton courButt = new JButton("Courier");
    private JButton algeButt = new JButton("Algerian");
    private JButton ariButt = new JButton("Arial");
    private JButton LS = new JButton("LARGER/SMALLER");
    private JLabel dem = new JLabel("FONT DEMONSTRATION MESSAGE");
    int size = 20;
    Font current = new Font("Helvetica", Font.PLAIN, 20);

    public JFrontSelector(){
        super();
        helvButt.addActionListener(this);
        tRButt.addActionListener(this);
        courButt.addActionListener(this);
        ariButt.addActionListener(this);
        algeButt.addActionListener(this);
        LS.addActionListener(this);
        p3.add(dem);
        p2.add(LS);
        p1.setLayout(new FlowLayout());
        p1.add(ariButt);
        p1.add(algeButt);
        p1.add(courButt);
        p1.add(tRButt);
        p1.add(helvButt);
        PANEL.setLayout(new GridLayout(3,0));
        PANEL.add(p1);
        PANEL.add(p2); 
        PANEL.add(p3);
        add(PANEL);
    }

    public void actionPerformed(ActionEvent e){
        Object source = new Object();
        source = e.getSource();
        if(source == helvButt)
            dem.setFont(new Font("Helvetica", Font.PLAIN, size));
        else if (source == tRButt)
            dem.setFont(new Font("Times New Roman", Font.PLAIN, size));
        
        else if(source == courButt)
            dem.setFont(new Font("Courier", Font.PLAIN, size));
        
        else if(source == ariButt)
            dem.setFont(new Font("Arial", Font.PLAIN, size));
        
        else if(source == algeButt)
            dem.setFont(new Font("Algerian", Font.PLAIN, size));
        
        else if(source == LS){
            if(size>=60)
                size+=10;
            else if(size<=15){
                size-=10;
            }
            current = dem.getFont();
            dem.setFont(current.deriveFont(size));
        }


    }

    public static void main(String[] args){
        JFrontSelector f = new JFrontSelector();
        int WIDTH = 400, HEIGHT = 250;
        f.setSize(WIDTH, HEIGHT);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
    }


}