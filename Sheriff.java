package mafia;

public class Sheriff extends Role
{
    public Sheriff()
    {
        this.isTown=true;
    }

    public boolean Interrogate()
    {
        //insert code to sheriff to interrogate others
        return false;
    }
    
    
    public String toString() {
    	return "Sheriff";
    }
}
