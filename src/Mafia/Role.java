package mafia;

import javax.swing.*;

public class Role extends JComponent
{
    private int voteCounter;
    protected boolean isTown;

    public Role()
    {
        voteCounter=0;
        isTown=true;
    }



    
    public static Role[] returnList(int numOfPlayers){			//Returns an array of roles based of the number of players
    	Doctor doctor = Doctor.getInstance();									//Recommend at least 6-7 players for an actually decent
    	Sheriff sheriff1 = new Sheriff();
    	Mafia maf1 = new Mafia();
    	//Mafia.Framer maf2 = new Mafia.Framer();
    	Mafia maf2 = new Mafia();
    	Villager village1 = new Villager();
    	Villager village2 = new Villager();
    	Villager village3 = new Villager();
    	Vigilante vig = Vigilante.getInstance();
    	
    	
    	 if(numOfPlayers == 4) {
    		Role[] fourList = {doctor, sheriff1, maf1, village1};			//The actual array of roles in the 4 player
    		
    		return fourList;
    	}
    	
    	else if (numOfPlayers == 5) {
    		Role[] fiveList = {doctor, sheriff1, maf1, village1, village2};
    		return fiveList;
    	}
    	
    	else if (numOfPlayers == 6) {
    		Role[] sixList = {doctor, sheriff1, maf1, village1, village2, village3};
    		return sixList;
    	}
    	
    	else if (numOfPlayers == 7) {
    		Role[] sevenList = {doctor, sheriff1, maf1, village1, village2, village3, maf2};
    		return sevenList;
    	}
    	
    	else if (numOfPlayers == 8) {
    		Role[] eightList = {doctor, sheriff1, maf1, village1, village2, village3, maf2, vig};
    		
    		return eightList; 
    	}
    	
    	 //Add however many players you want, recommended cap at 13 players.
    	return null;
    }
    
    
    
   

    public void vote()
    {
        voteCounter++;
    }

    public void setIsTown(boolean x)
    {
        isTown=x;
    }
    public boolean getIsTown()
    {
        return isTown;
    }
    
    public String description() {
    	return null;
    }
    
}
