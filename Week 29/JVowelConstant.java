/*Create an educational program for children that 
distinguishes between vowels and consonants as the
 user clicks buttons. Create 26 JButtons, each labeled 
 with a different letter of the alphabet. Create a 
 JFrame to hold three JPanels in a two-by-two grid. Randomly 
 select eight of the 26 JButtons and place four in each of 
 the first two JPanels. Add a JLabel to the third JPanel. 
 When the user clicks a JButton, the text of the JLabel 
 identifies the button’s letter as a vowel or consonant, 
 and then a new randomly selected letter replaces the 
 letter on the JButton. Save the file as JVowelConsonant.java. */

 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;

import java.util.Random;


 public class JVowelConstant extends JFrame implements ActionListener{
    private JFrame frame = new JFrame();
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    private JLabel label = new JLabel("");
    private JPanel PANEL = new JPanel();
    private String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    Random r = new Random();

    int zanore[] = {0,4,8,14,20,24};

    int buttons[] = {0,0,0,0,0,0,0,0};
    int ai,bi,ci,di,ei,hi,gi,fi;

    JButton a = new JButton();
    JButton b = new JButton();
    JButton c = new JButton();
    JButton d = new JButton();
    JButton e = new JButton();
    JButton f = new JButton();
    JButton g = new JButton();
    JButton h = new JButton();
    
    
    public JVowelConstant(){
        super();
        
        PANEL.setLayout(new GridLayout(3, 1));
        p1.setLayout(new GridLayout(1,4));
        p2.setLayout(new GridLayout(1,4));

        //vendosim butonat fillestare tek p1.
        ai = RandomNumberSelc(0);
        buttons[0] = ai;
        a.setText(alpha[ai]);
        a.addActionListener(this);
        p1.add(a);

         bi = RandomNumberSelc(ai);
        buttons[1] = bi;
        b.setText(alpha[bi]);
        b.addActionListener(this);
        p1.add(b);

         ci = RandomNumberSelc(bi);
        buttons[2] = ci;
        c.setText(alpha[ci]);
        c.addActionListener(this);
        p1.add(c);

         di = RandomNumberSelc(ci);
        buttons[3] = di;
        d.setText(alpha[di]);
        d.addActionListener(this);
        p1.add(d);

        //vendosim tek p2
         ei = RandomNumberSelc(di);
        buttons[4] = ei;
        e.setText(alpha[ei]);
        e.addActionListener(this);
        p2.add(e);

         fi = RandomNumberSelc(ei);
        buttons[5] = fi;
        f.setText(alpha[fi]);
        f.addActionListener(this);
        p2.add(f);

         gi = RandomNumberSelc(fi);
        buttons[6] = fi;
        g.setText(alpha[fi]);
        g.addActionListener(this);
        p2.add(g);

         hi = RandomNumberSelc(gi);
        buttons[7] = hi;
        h.setText(alpha[hi]);
        h.addActionListener(this);
        p2.add(h);

        //vendosim komponentet e tjere
        p3.add(label);
        PANEL.add(p1);
        PANEL.add(p2);
        PANEL.add(p3);

        add(PANEL);

        

    }

    public int RandomNumberSelc(int lastSelected){
        int selectedN = r.nextInt(26);
        for(int i=0; i<8; i++){
            if(selectedN == buttons[i] || selectedN == lastSelected)
                RandomNumberSelc(selectedN);
        }
        return selectedN;
    }

    public void actionPerformed(ActionEvent event){
        Object source = new Object();
        source = event.getSource();

        if(source == a){
            for(int i=0; i<6; i++){
                if(ai == zanore[i])
                    label.setText(alpha[ai]+" eshte nje zanore");
                    break;
            
            }label.setText(alpha[ai]+" eshte nje bashtingellore");
            
            ai = RandomNumberSelc(ai);
            buttons[0] = ai;
            a.setText(alpha[ai]);
            
            
            
        }
        if(source == b){
            for(int i=0; i<6; i++){
                if(bi == zanore[i])
                    label.setText(alpha[bi]+" eshte nje zanore");
                    break;
           
            } label.setText(alpha[bi]+" eshte nje bashtingellore");
           
            bi = RandomNumberSelc(bi);
            buttons[0] = bi;
            b.setText(alpha[bi]);
            
            
        }

        if(source == c){
            for(int i=0; i<6; i++){
                if(ci == zanore[i])
                    label.setText(alpha[ci]+" eshte nje zanore");
                    break;
           
            }label.setText(alpha[ci]+" eshte nje bashtingellore");
            ci = RandomNumberSelc(ci);
            buttons[0] = ci;
            c.setText(alpha[ci]);
            
            
            
        }

        if(source == d){
            for(int i=0; i<6; i++){
                if(di == zanore[i])
                    label.setText(alpha[di]+" eshte nje zanore");
                    break;
           
            }label.setText(alpha[di]+" eshte nje bashtingellore");
            di = RandomNumberSelc(di);
            buttons[0] = di;
            d.setText(alpha[di]);
            
            
            
        }

        if(source == f){
            for(int i=0; i<6; i++){
                if(fi == zanore[i])
                    label.setText(alpha[fi]+" eshte nje zanore");
                    break;
           
            }label.setText(alpha[fi]+" eshte nje bashtingellore");
            fi = RandomNumberSelc(fi);
            buttons[0] = fi;
            f.setText(alpha[fi]);
            
            
          
        }

        if(source == g){
            for(int i=0; i<6; i++){
                if(gi == zanore[i])
                    label.setText(alpha[gi]+" eshte nje zanore");
                    break;
           
            }  label.setText(alpha[gi]+" eshte nje bashtingellore");
            gi = RandomNumberSelc(gi);
            buttons[0] = gi;
            g.setText(alpha[gi]);
            
        
        }


        if(source == h){

           
            for(int i = 0; i<6; i++){
                if(hi == zanore[i])
                    label.setText(alpha[hi]+" eshte nje zanore");
                    break;
            }
            label.setText(alpha[hi]+" eshte nje bashtingellore");
            hi = RandomNumberSelc(hi);
            buttons[0] = hi;
            h.setText(alpha[hi]);
 
        }

        frame.invalidate();
        frame.validate();
        frame.repaint();
    }
    
    public static void main(String[] args){
        JVowelConstant frame = new JVowelConstant();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
