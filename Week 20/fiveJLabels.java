/*
 * Krijoni nje aplikacion me 5 JFame qe shfaqen 
 * ne qender te ekranit me permasa qe zbriten me 100 px.
 */
import java.awt.*;
import javax.swing.*;

public class fiveJLabels {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JFrame frame2 = new JFrame();
        JFrame frame3 = new JFrame();
        JFrame frame4 = new JFrame();
        JFrame frame5 = new JFrame();
    
        frame.pack();
        frame2.pack();
        frame3.pack();
        frame4.pack();
        frame5.pack(); 
        
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(700, 700);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(600,600);
        frame3.setLocationRelativeTo(null);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setSize(500,500);
        frame4.setLocationRelativeTo(null);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setSize(400,400);
        frame5.setLocationRelativeTo(null);
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);
        frame4.setVisible(true);
        frame5.setVisible(true);

    }
}
