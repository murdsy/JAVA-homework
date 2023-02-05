/*
 * Eliza është një program i famshëm kompjuterik i vitit 1966, 
 * shkruar nga Joseph Weizenbaum. Imiton një psikolog (më saktësisht, 
 * një terapist Rogerian) duke riformuluar shumë nga shprehjet e një 
 * pacienti si pyetje dhe duke i paraqitur ato tek pacienti. Kjo 
 * lloj terapie (nganjëherë quhet jo e drejtuar) shpesh është i 
 * parodizuar në filma dhe shfaqje televizive, në të cilat terapisti 
 * nuk ka madje nevojë të dëgjojë pacientin, por jep përgjigje "të 
 * konservuara" që e çojnë pacientin nga fjalia në fjali. Për shembull,
 *  kur pacienti thotë: "Unë kam probleme me vëllanë tim", terapisti
 *  mund të thotë: "Më trego më shumë për vëllain tënd." Nëse pacienti 
 * thotë: "Nuk më pëlqen shkolla", terapisti mund të thotë: "Pse thua 
 * qe ti nuk e pëlqen shkollën? ” Eliza u bë një moment historik në 
 * historinë e kompjuterave sepse ishte hera e parë që një programues
 *  kompjuteri u përpoq të krijonte iluzionin e bashkëveprimit njeri-njeri. 
 * Krijoni një version të thjeshtë të Eliza duke lejuar përdoruesin të 
 * futë fjali vazhdimisht derisa përdoruesi të pushojë duke shtypur 
 * "Mirupafshim". Pas çdo fjalie, lërini kompjuterin të bëjë një 
 * nga përgjigjet e mëposhtme: Nëse përdoruesi ka futur fjalën "tim" 
 * (për shembull, "Unë kam probleme me vëllain tim"), përgjigjuni me 
 * "Më tregoni më shumë për ate" dhe futni emrin në fjalë - për 
 * shembull, "Më trego më shumë për vëllain tënd". Kur kërkoni 
 * një fjalë në hyrjen e përdoruesit, sigurohuni që ajo është e 
 * tërë fjala dhe jo vetëm shkronja brenda një fjale tjetër. Për 
 * shembull, kur kërkoni për “tim”, sigurohuni që të mos jetë pjesë e 
 * një fjale tjetër, siç është “argetim”. Nëse përdoruesi jep një 
 * fjalë të fortë, siç është "dashuria" ose "urrejtja", përgjigjeni 
 * me: "Ju duket se keni ndjenja të forta për këtë".
Shtoni disa përgjigje të tjera të përshtatshme për zgjedhjen tuaj. 
Në mungesë të ndonjë prej hyrjeve të mëparshme, përgjigjuni me një 
frazë të rastit nga sa vijon: "Ju lutemi vazhdoni", "Më tregoni më 
shumë" ose "Vazhdoni". Ruani skedarin si Eliza.java.
*/


import java.util.Scanner;
public class Eliza{
    public static void main(String[] arg){
        //Keyword Strings
    
        //String greetings[] = {"ckemi", "pershendetje", "hey", "mirupafshim"};
        
        String people[] = {"vella","mami","babi","motra","shok"};
        String emotions[] = {"merzit","lumt","xheloz","dashuri","urrej", "ndihem", "keq","mire", "ndjej"};
        //We will be able to compare these keyword strings to the strings in the Sentences to ensure how the conversation goes and guess an appropriate response

        Scanner in = new Scanner(System.in);        
        System.out.println("Mireseerdhet tek ELIZA. Thoni 'Mirupafshim' per te mbyllur biseden.");
        System.out.println(">>> Pershendetje! Si mundem t'ju ndihmoj! :D");
        //getting continuous input
        System.out.print(">>> ");
        String thisinput = in.nextLine();
        while (thisinput.equalsIgnoreCase("Mirupafshim") != true){
            //compare user input.

            

            //compare next line            
            thisinput = in.nextLine();
        }

        

    }
}