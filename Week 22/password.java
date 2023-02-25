import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class password extends JFrame implements ActionListener{
    FlowLayout flow = new FlowLayout();
    JLabel l1 = new JLabel("Jepni Passwordin");
    JLabel l2 = new JLabel("");
    JTextField txpassword = new JPasswordField(10);
    JButton btt = new JButton("Gjej passwordin");
    int count=0;

    public password(){
        super("Passwordi");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());
            btt.addActionListener(this);
            add(l1);
            add(txpassword);
            add(btt);
            add(l2);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){ 
        String text = txpassword.getText();
        if(text == "psw"){
            l2.setText("Passwordi u gjet!");
            count=0;
        }
        else{
            l2.setText("Ju nuk e gjetet passwordin! ");
            count++;
            if(count >=3){
                btt.setEnabled(false);
            }
        }
    }




    public static void main(String[] args){
        password frame = new password();
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}