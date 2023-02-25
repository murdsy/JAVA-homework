import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class fjalor {

    public static void main(String[] args){

        //vendosim vlera tek fjalori
        Map<String, String> fjalorAS = new HashMap<String, String>();
        fjalorAS.put("book", "liber");
        fjalorAS.put("door", "dere");
        fjalorAS.put("board", "tabele");
        fjalorAS.put("table", "tavoline");
        fjalorAS.put("mouse", "mi");
        fjalorAS.put("lamp", "llampe");
        fjalorAS.put("pen", "stilolaps");
        fjalorAS.put("pencil", "laps");
        fjalorAS.put("paper", "flete");
        fjalorAS.put("dog", "qen");
        fjalorAS.put("cat", "mace");
        fjalorAS.put("classroom", "klase");

        JFrame frame = new JFrame("fjalor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 250);
        JPanel panel = new JPanel();
        JTextField ang = new JTextField(10);
        JTextField shqp = new JTextField(10);
        JLabel l1 = new JLabel("Anglisht");
        JLabel l2 = new JLabel("Shqip");
        JButton b = new JButton("Perkthe");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(fjalorAS.containsKey(ang.getText()) == true){
                    shqp.setText(fjalorAS.get((ang.getText())));
                }
                else {
                    shqp.setText("Error: nuk ka fjale");
                }
            }
        });
        
        panel.add(l1);
        panel.add(ang);
        panel.add(b);
        panel.add(l2);
        panel.add(shqp);

        frame.add(panel);
        frame.setVisible(true);

    }


    

}
