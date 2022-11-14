/*LAB WORK - WEEK 8
WRITE A JAVA PROGRAM THAT SIMULATES GRAPHS2 WITH GUI
LINEAR AND EXPONENTIALS */

import java.util.Scanner;
public class graphfunction{

    public static void setCanvas(double minx, double maxx){
        //StdDraw StdDraw;
        StdDraw.setCanvasSize(500, 500);
        StdDraw.clear(StdDraw.BLUE);
        StdDraw.setXscale(minx, maxx);
        StdDraw.setYscale(-7*(maxx),7*(maxx));
        //vizatojme boshtin
        StdDraw.setPenColor(0,0,0);
        StdDraw.line(minx,0, maxx, 0); //bosht x
        StdDraw.line(0, (-7*maxx),0, (7*maxx)); // bosht y
        StdDraw.setPenColor(170,0,0);

    }

    public static double GraphLinear(double k, double c, int x){
        double y = x*k+c;
        return y;
    }

    public static double GraphParabola(double a, double b, double c, int x){
        double y = (x*x*a)+(x*b)+c;
        return y;
    }

    public static void GraphPointCreator(int choice, double c1, double c2, double c3, int minx, int maxx){
        double y;
        if(choice == 1){
            double y1;
            y = GraphLinear(c1, c2, minx);
            y1 = GraphLinear(c1, c2, maxx);
            StdDraw.line((minx*1.0), y, (maxx*1.0), y1);
        }
        else{
            for(int i = minx; i<maxx; i++){
                double y1;
                y = GraphParabola(c1, c2, c3, i);
                y1 = GraphParabola(c1, c2, c3, i+1);

                StdDraw.line((i*1.0), y, ((i+1)*1.0), y1);
            }
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int choice;
        int minx;
        int maxx;
        double c;
        double m;
        double a;
        double b;

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
                    setCanvas((minx*1.0), (maxx*1.0));
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
                    setCanvas((minx*1.0), (maxx*1.0));
                    GraphPointCreator(choice, a, b, c, minx, maxx);
                    break;
            }

            System.out.println("Mireseerdhet ne simulimin e grafikave ne JAVA\n Zgjidhni llojin e grafikut qe do simuloni: \n1 - Linear\n2-Parabole\n3-Ikni nga programi");
            choice = in.nextInt();

        }

        in.close();

    }
}