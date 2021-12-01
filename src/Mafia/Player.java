package mafia;

public class Player
{
	private int playerIndex;
    private String username;
    private Role role;
    private boolean isAlive;
    private boolean isHealed;								//Boolean to denote whether or not this particular player object is healed
    												//by the doctor on a particular night
    
    private boolean isTargeted;								//Boolean to denote whether or not this particular player object is a 
    													//target of the mafia on a particular night

    
    private boolean isFramed;
    public Player(String name, int a)
    {
    	playerIndex = a;
    	
        username=name;

        isAlive=true;
        
        isHealed = false;
        
        isTargeted = false;
        
        isFramed = false;
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
   
    public int getIndex() {
    	return this.playerIndex;
    }
    
    public void setIsAlive(boolean val) {
    	this.isAlive = val;
    }
   
    public boolean getIsAlive() {
    	return this.isAlive;
    }
    
    public void setIsTarget(boolean val) {
    	this.isTargeted = val;
    }
    
    public boolean getIsTarget() {
    	return this.isTargeted;
    }
    
    public void setIsHealed(boolean val) {
    	this.isHealed = val;
    }

    public boolean getIsHealed() {
    	return this.isHealed;
    }
    
    public void setIsFramed(boolean val) {
    	this.isFramed = val;
    }
    
    public boolean getIsFramed() {
    	return this.isFramed;
    }
    /**
     * Checks to see if the current player is alive
     * @return boolean whether the player is alive or not
     */
    public boolean checkPlayerAlive()
    {
        return isAlive;
    }
}

