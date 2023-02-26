import java.util.Scanner;
public class equals
{
   public static void main(String[] args)
   {  	String s1 = "Mary";  	String s2;
 	 Scanner in = new Scanner(System.in);
      System.out.print("Jepni emrin tuaj ");
  	s2 = in.nextLine();
      if(s1.equals(s2))
         System.out.println(s1 + " i barabarte me " + s2);
  	else
         System.out.println(s1 + " jo i barabarte me " + s2);
   }
}
