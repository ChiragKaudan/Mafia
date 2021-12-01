package mafia;
import javax.swing.JOptionPane;



public class Mafia extends Role
{
	/*
	public static class Framer extends Role{				//Inner class Framer of Mafia
		
		
		
		public int frame() {
			
			
			return 0;
		}
		
		public String toString(){
			return "Framer";
		}
		
		public String description()
	    {
	        return "You are a framer, a talented deceptionist who manipulates information for the Mafia, a ruthless group of "
	        		+ "evildoers who know each others' identities and participate"
	        		+ " in organized crime together. All Mafia members have the same goal; to kill anyone that will not submit to"
	        		+ " the Mafia. Each night, you may select "
	        		+ "a target to frame. A framed target will look suspicious to the sheriff the night they are interrogated. "
	        		+ "The town is completely clueless about"
	        		+ " you and your fellow Mafia members' identities, but with every day they will come closer and closer"
	        		+ "to finding and publicly hanging you...if they're not already dead!";
	    }

	}
*/
    public Mafia()
    {
        this.isTown=false;
    }

    
    /**
     * 
     * Lets the mafioso decide who they want to mark (call a hit) for assassination tonight, if they choose to do so at all. 
     * @return index of player who is marked for assassination, -1 if mafioso decides not to mark anybody
     * @param none
     */
    public int hit() {
    	int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to call a hit on someone?", "Call A Hit?",dialogButton);
    	if(dialogResult == 0) {
    		String input1 = JOptionPane.showInputDialog("Input the index (number) of the player you want to kill");
    		return Integer.valueOf(input1);
    	}
    	else {
        	return -1;
        }
    }


    
    
    public String toString() {
    	return "Mafia";
    }
    
    public String description()
    {
        return "You are a mafioso, a member of the Mafia which is a ruthless group of evildoers who know each others' identities and participate"
        		+ " in organized crime together. All Mafia members have the same goal; to kill anyone that will not submit to"
        		+ " the Mafia. Each night, you may select "
        		+ "a target to kill. The town is completely clueless about"
        		+ " you and your fellow Mafia members' identities, but with every day they will come closer and closer"
        		+ "to finding and publicly hanging you...if they're not already dead!";
    }
}
