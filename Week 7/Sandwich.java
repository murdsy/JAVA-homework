/*
 * a.Create a class named Sandwich. Data fields include a String for the main
ingredient (such as tuna), a String for bread type (such as wheat), and a
double for price (such as 4.99). Include methods to get and set values for each of
these fields. Save the class as Sandwich.java.
b.  Create an application named TestSandwich that instantiates one Sandwich object
and demonstrates the use of the set and get methods. Save this application as
TestSandwich.java.
 */

public class Sandwich {
    String mainIng;
    String bread;
    double price;

    public void setMainIng(String MI){
        this.mainIng = MI;
    }
    public  void setBread(String b){
        this.bread = b;
    }
    public void setprice(double p){
        this.price = p;
    }
    public String getMainIng(){return mainIng;}
    public String getBread(){return bread;}
    public double getPrice(){return price;}
}
