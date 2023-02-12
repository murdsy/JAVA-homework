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

        frame.setSize(420,420); //x,y
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        JLabel text = new JLabel();
        
        
        for(int i=1; i<=10; i++){
            text.setText("Text Number "+i);
            Font f1 = new Font(Font.DIALOG_INPUT, Font.PLAIN, 10+i);
            text.setFont(f1);
            //text.setHorizontalAlignment(JLabel.CENTER);
            //text.setVerticalAlignment(JLabel.CENTER);
            frame.add(text);
        }

        

    }
}
