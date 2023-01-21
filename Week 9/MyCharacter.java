/* Computer games often contain different characters or creatures. For example, you
might design a game in which alien beings possess specific characteristics such as
color, number of eyes, or number of lives. Design a character for a game, creating a
class to hold at least three attributes for the character. Include methods to get and
set each of the character’s attributes. Save the file as MyCharacter.java. Then write
an application in which you create at least two characters. In turn, pass each
character to a display method that displays the character’s attributes. Save the
application as TwoCharacters.java. */

public class MyCharacter {
    private String name;
    private String eyecolor;
    private int stamina;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getEC(){
        return eyecolor;
    }
    public void setEC(String newEC){
        this.eyecolor = newEC;
    }
    public int getStamina(){
        return stamina;
    }
    public void setStamina(int newStamina){
        this.stamina = newStamina;
    }
}