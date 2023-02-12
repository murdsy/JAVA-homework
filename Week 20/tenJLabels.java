/*
 * Krijoni nje JFrame brenda se ciles te shtoni 10 
 * JLabel-s me emrat Teksti1,... Teksti10.
    Rritni madhesine e shkrimit ne secilin JLabel.
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
public class tenJLabels {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(650,650); //x,y
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        JLabel text = new JLabel();
        
        
        for(int i=1; i<=10; i++){
            
            Font f1 = new Font(Font.DIALOG_INPUT, Font.PLAIN, 10+i);
            text.setFont(f1);
            text.setText("Text Number "+i+"\n");
            panel.add(text); 
            frame.add(panel);
            //text.setBounds(10, 10+i, 300, 20-i);
            //panel.add(text);
        }

        frame.add(panel);
        

    }
}
