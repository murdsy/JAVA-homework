import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DKlase1 extends JFrame implements ActionListener{

    JFrame f = new JFrame("JCombo box");
    JLabel puna1 = new JLabel("Zgjidhni punen: ");
    JLabel koha1 = new JLabel("Zgjidhni kohen: ");
    //(Financier, , IT, Menaxher Shitjesh)
    String punet[] ={"Financier", "Menaxher Shitjesh","IT","Ing Elektrik"};
    JComboBox puna = new JComboBox<>(punet);
    JCheckBox parttime = new JCheckBox();
    JCheckBox fullTime = new JCheckBox();
    JButton apply = new JButton();
    JLabel result = new JLabel("");

    public DKlase1(){
        f.setLayout(new FlowLayout());
        puna.addActionListener(this);
        parttime.addActionListener(this);
        fullTime.addActionListener(this);
        apply.addActionListener(this);
        add(puna1);
        add(puna);
        add(koha1);
        add(parttime);
        add(fullTime);
        add(apply);
        add(result);
    }
    @Override
    public void actionPerformend(ActionEvent e)
    {
        Object source = e.getSource();

        String puna2 = "";
        String koha2 = "";

        // if the state combobox is changed
        if (source == puna) 
            puna2 = puna.getSelectedItem()+"";   
        if(source == fullTime || source == parttime){
            koha2 = (parttime.isSelected() == true?"part-time":"");
            koha2 = (fullTime.isSelected() == true?"full-time":"");
        }
        else if(fullTime.isSelected() == true && parttime.isSelected() == true){
            koha2 = "part time dhe full time";
        }
        if(source == apply)
            result.setText("Ju zgjodhet te applikoni per punen "+ puna2 +" ne kohen/t "+koha2);
            
        
    }

    public static void main(String[] args){
        DKlase1 f = new DKlase1();
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   
}
