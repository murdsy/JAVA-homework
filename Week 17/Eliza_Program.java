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

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.Random;

public class Eliza_Program {

    //funksione
    public static String removePunct(String input) {
        return input.replaceAll("\\p{Punct}", "");
    }

    //skedare
    public static String[] convoContinuation = {
        "Me thoni me shume.", "Me tregoni me shume per kete", "Kuptoj, edhe me pas?", "Po ju ndjek, me thoni me shume"
    };

    public static String[] emotionsAndNeeds = {
        "merzit","lumt","xheloz","dashuri","urrej", "ndihem", "keq","mire", "ndjej"
    };

    public static String[] owning = {
        "tim", "time", "ime", "ime", "saj", "tij",  
    };

    public static String[] people = {};

    //funksioni main
    public static void main(String[] args){

        //int index = 0; 
        String[] inputWords;
        Pattern pattern = Pattern.compile(" "); 

        System.out.println("Mireseerdhet tek ELIZA. Thoni 'Mirupafshim' per te mbyllur biseden.");
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println("Eliza >>>> Pershendetje, une jam ELIZA! Si mundem t'ju ndihmoj?");

        try(Scanner in = new Scanner(System.in)){

            //while loop until "Mirupafshim"
            while(true){
                System.out.print("You >>>> ");
                String input = in.nextLine(); //inputi i perdoruesit merret ketu

                //inputit te perdoruesit i hiqet pikezimi (funksioni removePunct)

                input = removePunct(input);

                if(input.equalsIgnoreCase("Mirupafshim"))
                    break; //prishet loop kur perdoruesi thote mirupafshim

                //cdo fjale do vendoset ne nje array dhe krahasohet
                inputWords = pattern.split(input);

                //krahasojme inputin me secilen nga skedari
                boolean wordFound = false; //perdorim boolean per kontroll
                outerloop:
                for(String word : emotionsAndNeeds){
                    for(String inputWord : inputWords){
                        if(inputWord.equalsIgnoreCase(word)){
                            wordFound = true;
                            System.out.println("Eliza >>> Paskeni ndjenja shume te forta per kete....");
                            break outerloop; //dalim nga loopi
                        }
                    }
                }

                outerloop:
                for(String word : owning){
                    for(String inputWord : inputWords){
                        if(inputWord.equalsIgnoreCase(word)){
                            wordFound = true;
                            int index = Arrays.asList(inputWords).indexOf(inputWord);

                            //fjalet e pronesise: vajza ime, djalin tim, ajo e saj, etj.
                            if(word == "saj" || word == "tij")
                                System.out.println("Eliza >>>> Me thoni me shume per '"+inputWords[index-2]+" "+inputWords[index-1]+" "+inputWords[index]+"', sic me thate.");
                            else
                                System.out.println("Eliza >>>> Me thoni me shume per '"+inputWords[index-1]+" "+inputWords[index]+"', sic me thate.");
                            

                            break outerloop;
                        }
                    }
                }
                
                    
                    if (wordFound == false){
                        Random random = new Random();
                        int index = random.nextInt(convoContinuation.length);
                        System.out.println("Eliza >>>> "+convoContinuation[index]);
                    }
                
            } 
            //closing programme
            System.out.println("Eliza >>>> Mirupafshim!");
            System.out.println("--------------------------------------------");

        }

    }
}
