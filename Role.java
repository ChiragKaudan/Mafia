package mafia;

import java.util.ArrayList;

public class Role
{
    private int voteCounter;
    protected boolean isTown;

    public Role()
    {
        voteCounter=0;
        isTown=true;
    }
    
    public static ArrayList<Role> returnList(int numOfPlayers){			//Returns a list of___ based of the number of players
    	Doctor doctor1 = new Doctor();									//Recommend at least 6-7 players for an actually decent
    	Sheriff sheriff1 = new Sheriff();
    	Mafia maf1 = new Mafia();
    	Mafia maf2 = new Mafia();
    //	Villager village1 = new Villager();
   // 	Villager village2 = new Villager();
    //	Vigilante vig1 = new Vigilante();
    	
    	
    	if(numOfPlayers < 4) {
    		return null;
    	}
    	else if(numOfPlayers == 4) {
    		ArrayList<Role> Fourlist = new ArrayList<Role>(4);
    		Fourlist.add(doctor1, sheriff1, maf1, village1);
    		return Fourlist;
    	}
    	
    	else if (numOfPlayers == 5) {
    		ArrayList<Role> FiveList = new ArrayList<Role>(4);
    		FiveList.add(doctor1, sheriff1, maf1, village1);
    		return Fivelist;
    	}
    	
    	else if (numOfPlayers == 6) {
    		ArrayList<Role> FiveList = new ArrayList<Role>(4);
    		FiveList.add(doctor1, sheriff1, maf1, village1);
    		return Sixlist;
    	}
    	
    	else if (numOfPlayers == 7) {
    		ArrayList<Role> FiveList = new ArrayList<Role>(4);
    		FiveList.add(doctor1, sheriff1, maf1, village1);
    		return Sevenlist;
    	}
    	
    	else if (numOfPlayers == 8) {
    		ArrayList<Role> FiveList = new ArrayList<Role>(4);
    		FiveList.add(doctor1, sheriff1, maf1, village1);
    		return Eightlist; 
    	}
    	
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
    
    
    public void description()
    {
        System.out.println("Insert Proper Role Description");
    }
}
