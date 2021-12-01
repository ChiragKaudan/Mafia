package mafia;

public class Villager extends Role
{

    public Villager()
    {
        this.isTown=true;
    }
    
    public String toString() {
    	return "Villager";
    }
    
    public String description()
    {
        return "You are a simple villager, a townsperson trying to live your life peacefully in the town you've always known as home. But"
        		+ "living among your neighbors are people who seek to kill anybody who will not submit to the Mafia. Your goal"
        		+ "is to work with the other townsmembers to find and hang all hidden Mafia members. Just note, you can't"
        		+ "trust everybody!";
    }
}
