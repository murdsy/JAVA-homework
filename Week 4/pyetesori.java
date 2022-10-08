/*
 * Desc (AL):Shkruani nje program qe shfaq ne menyre te njepasnjeshme 5 dritare konfirmimi me 5 pyetje:
A ndryshon gjate ekzekutimit te programit nje konstante?
A mund te perdoret tipi boolean per te ruajtur vlerat true dhe false?
A mund te perdoret metoda showMessageDialog() per te lexuar nga tastiera?
A eshte e nevojshme te perdorim metodat parseInt() dhe parseDouble() nese duam te lexojme numra me GUI?
A mund te ruhet nje program ne java ne nje file me emertim te cfaredoshem, qe nuk ka lidhje me emrin e klases?
Ne fund duhet te afishohet numri i pikeve te sakta. 
 */
import javax.swing.JOptionPane;
class pyetesori{
    public static void main(String[] arg){
        String p1, p2, p3, p4, p5;
        float piket = 0;
        
        p1 = JOptionPane.showInputDialog(null, "A ndryshon gjate ekzekutimit te programit nje konstante? Po/Jo");
        p2 = JOptionPane.showInputDialog(null, "A mund te perdoret tipi boolean per te ruajtur vlerat true dhe false? Po/Jo");
        p3 = JOptionPane.showInputDialog(null, "A mund te perdoret metoda showMessageDialog() per te lexuar nga tastiera? Po/Jo" );
        p4 = JOptionPane.showInputDialog(null, "A eshte e nevojshme te perdorim metodat parseInt() dhe parseDouble() nese duam te lexojme numra me GUI? Po/Jo");
        p5 = JOptionPane.showInputDialog(null, "A mund te ruhet nje program ne java ne nje file me emertim te cfaredoshem, qe nuk ka lidhje me emrin e klases? Po/Jo/Varet");

        if(p1=="Jo")
        piket+=1.0;
        if(p2 == "Po")
        piket+=1.0;
        if(p3 == "Jo")
        piket+=1.0;
        if(p4 == "Jo")
        piket+=1.0;
        if(p5=="Varet")
        piket+=1.0;
        else if(p5=="Po" || p5 =="Jo")
        piket+=0.5;

        else if(p1=="Jo" || p2 == "Jo"|| p3 == "Po" || p4 == "Po")
        piket+=0;

        else
        System.out.println("Nuk ka pergjigje te ketille");

        System.out.println("Piket: "+ piket);

    }
}
