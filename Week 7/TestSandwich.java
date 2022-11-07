public class TestSandwich {
    public static void main(String[] args){
        Sandwich s = new Sandwich();
        s.setMainIng("tuna");
        s.setBread("integral");
        s.setprice(3.5);;

        System.out.println("Bread: "+s.getBread()+"\nMain Ingredient: "+s.getMainIng()+"\nPrice: "+s.getPrice());
        
    }

}
