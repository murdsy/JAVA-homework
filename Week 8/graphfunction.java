/*LAB WORK - WEEK 8
WRITE A JAVA PROGRAM THAT SIMULATES GRAPHS WITH GUI
LINEAR AND EXPONENTIALS */

import java.util.Scanner;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class graphfunction extends JPanel{
    public static void createAndShowGui(){
        
    }

    public static int GraphLinear(int k, int c, int x){
        int y = x*k+c;
        return y;
    }

    public static int GraphParabola(int a, int b, int c, int x){
        int y = (x*x*a)+(x*b)+c;
        return y;
    }

    public static void GraphPointCreator(int choice, int c1, int c2, int c3, int minx, int maxx){
        int y;
        if(choice == 1){
            y = GraphLinear(c1, c2, minx);
            y = GraphLinear(c1, c2, minx);
        }
        else{
            for(int i = minx; i<maxx; i++){
                y = GraphParabola(c1, c2, c3, i);
            }
        }
    }

    public static void main(String[] args){

        

        Scanner in = new Scanner(System.in);

        int choice;
        int minx;
        int maxx;
        int c;
        int m;
        int a;
        int b;

        System.out.println("Mireseerdhet ne simulimin e grafikave ne JAVA\n Zgjidhni llojin e grafikut qe do simuloni: \n1 - Linear\n2-Parabole\n3-Ikni nga programi");
        choice = in.nextInt();

        while(choice != 3){
            System.out.println("Faleminderit per zgjedhjen tuaj, zgjidhni nje range te x: ");
            System.out.print("xmin: ");
            minx = in.nextInt();
            System.out.print("xmax: ");
            maxx = in.nextInt();

            if(minx > maxx){
                System.out.println("error min<maxx");
                
            }

            switch(choice){
                case 1:
                    System.out.println("You choose linear graph. Enter compnents of m and c below:");
                    System.out.print("m: ");
                    m = in.nextInt();
                    System.out.print("c: ");
                    c = in.nextInt();
                    GraphPointCreator(choice, m, c, 0, minx, maxx);
                    break;
                case 2:
                    System.out.println("You choose parabola. Enter compnents a (x^2), b(x) and c: ");
                    System.out.print("a: ");
                    a = in.nextInt();
                    System.out.print("b: ");
                    b = in.nextInt();
                    System.out.print("c: ");
                    c = in.nextInt();

                    GraphPointCreator(choice, a, b, c, minx, maxx);
                    break;
            }

            System.out.println("Mireseerdhet ne simulimin e grafikave ne JAVA\n Zgjidhni llojin e grafikut qe do simuloni: \n1 - Linear\n2-Parabole\n3-Ikni nga programi");
            choice = in.nextInt();

        }

    }
}