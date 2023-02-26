import javax.swing.JOptionPane;
public class convertStringtoInteger{
   public static void main(String[] args)
   {
      String stringoret;
      int oret;
      Integer integeroret;
      final double PAY_RATE = 12.25;
      stringoret = JOptionPane.showInputDialog(null,
        "Sa ore keni punuar me shume?");
      integeroret = Integer.valueOf(stringoret);
      oret = integeroret.intValue();
      JOptionPane.showMessageDialog(null, "Ju punuat " +
         oret + " ore me $" + PAY_RATE + " per ore" +
         "\nGjithsej $" + (oret * PAY_RATE));
   }
}
