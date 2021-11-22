package mafia;

public class Player
{
	private int playerIndex;
    private String username;
    Role role;
    boolean isAlive;
    boolean isHealed;								//Boolean to denote whether or not this particular player object is healed
    												//by the doctor on a particular night
    boolean isTargeted;								//Boolean to denote whether or not this particular player object is a 
    												//target of the mafia on a particular night

    public Player(String name, int a)
    {
    	playerIndex = a;
    	
        username=name;

        isAlive=true;
        
        isHealed = false;
        
        isTargeted = false;
    }
    
    public void setName(String name)
    {
        username=name;
    }
    
    public String getName()
    {
        return username;
    }

    public void setRole(Role r)
    {
        role=r;
    }
    public Role getRole() {
    	return this.role;
    }
   
}
