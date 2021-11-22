package mafia;

public class Doctor extends Role
{
    public Doctor()
    {
        this.isTown=true;
    }

    
    public int heal() 
    {
    	
		return -1;
    	
    	//If self-heal counter != 0 then Prompts user if they want to self-heal. 
    	// if no, prompt
    	
    	
        
    }
    
    public String toString() {
    	return "Doctor";
    }
    
}
