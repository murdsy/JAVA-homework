import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoCardLayout2 extends JFrame     implements ActionListener
{
   private CardLayout cards = new CardLayout();
   private JButton b1 = new JButton("Ace of Hearts");
   private JButton b2 = new JButton("Three of Spades");
   private JButton b3 = new JButton("Queen of Clubs");
   private JButton b4 = new JButton("Two of diamonds");
   private Container con = getContentPane();
   public JDemoCardLayout2()
   {
      con.setLayout(cards);
      con.add("ace", b1);
      b1.addActionListener(this);
      con.add("diamons", b4);
      b4.addActionListener(this);
      con.add("three", b2);
      b2.addActionListener(this);
      con.add("queen", b3);
      b3.addActionListener(this);
      
      
      setSize(200, 100);
   }
   public void actionPerformed(ActionEvent e)
   {
      cards.next(getContentPane());
   }
   public static void main(String[] args)
   {
      JDemoCardLayout2 frame = new JDemoCardLayout2();
      frame.setVisible(true);
   }
}