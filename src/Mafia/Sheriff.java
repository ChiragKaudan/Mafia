package mafia;

import javax.swing.JOptionPane;

public class Sheriff extends Role
{
    public Sheriff()
    {
        this.isTown=true;
    }

    public int Interrogate() {
    	int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you suspicious of anyone tonight?", "Interrogate?", dialogButton);
    	if(dialogResult == 0) {
    		String input1 = JOptionPane.showInputDialog("Input the index (number) of the player you wish to interrogate. It is not advisable to interrogate yourself!");
    		return Integer.valueOf(input1);
    	}
    	else {
        	return -1;
        }
    }
    
    public String toString() {
    	return "Sheriff";
    }
    
    public String description()
    {
        return "You are the sheriff of the town, now keeping a low-profile to hide from the Mafia who would love nothing more"
        		+ "than being able to hunt you down and end your life, because of how big of a threat you are to them. You can "
        		+ "choose to interrogate any player each night to determine whether they are suspicious (a member of the Mafia) "
        		+ "or not.";
    }
}
