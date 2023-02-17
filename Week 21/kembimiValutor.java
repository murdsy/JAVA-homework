//Krijoni nje aplikacion per kembimin valutor si ne foton bashkengjitur.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kembimiValutor {
    public static void main(String[] args){
        
        //declaration
        JFrame f = new JFrame("Kembimi Valutor");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250,300);
        f.setResizable(false);
        
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);

        JLabel l0 = new JLabel("Kembimi Valutor");
        JLabel l1 = new JLabel("Kursi i kembimit: ");
        JLabel l2 = new JLabel("         Dollare: ");
        JLabel l3 = new JLabel("             Lek: ");

        l0.setFont(new Font("MS Mincho",Font.PLAIN, 30));

        JButton bttn = new JButton("           Konverto $-Lek           ");
        bttn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double kembimiV = Double.parseDouble(t1.getText());
                double dollare = Double.parseDouble(t2.getText());
                double lek = dollare * kembimiV;

                t3.setText(String.valueOf(lek));
            }
        });

        JPanel panel = new JPanel();

        panel.add(l0);
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(bttn);
        panel.add(l3);
        panel.add(t3);

        f.add(panel);
        f.setVisible(true);
    }

}