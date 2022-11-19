public class TwoCharacters {
    public static void main(String[] args){
        MyCharacter c1 = new MyCharacter();
        MyCharacter c2 = new MyCharacter();

        c1.setName("Steve");
        c2.setName("Alex");
        c1.setEC("brown");
        c2.setEC("green");
        c1.setStamina(20);
        c2.setStamina(20);

        System.out.print("CHARACTER 1\n"+c1.getName()+"\nEye Color: "+c1.getEC()+"\nStamina: "+c1.getStamina());
        System.out.print("\n\nCHARACTER 2\n"+c2.getName()+"\nEye Color: "+c2.getEC()+"\nStamina: "+c2.getStamina());


    }
}
