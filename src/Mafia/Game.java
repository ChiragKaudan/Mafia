package mafia;
import java.util.*;



public class Game
{
    static int numOfPlayers;
    static int numOfMafia;
    static ArrayList<Player> playerList;
    static ArrayList<Player> shuffledList;
    
    static Role[] roleList;

    
 

    
    public static void print() {						//Prints the playerList
    	for(Player pl : playerList) {
    		System.out.print(pl.getName()+", ");
    	}
    	System.out.println();
    }
    
   
    
    
     public void play()
    { 
    	 /*
          * FIRST DAY PHASE: ASSIGNING ROLES 
          * 
          * Uses a shuffling procedure based on default randomness so that players have no way of making associations between
          * the entered username order displayed in the PlayerList and the assigning of roles.
          * 
          */
    	
    	
    	if(numOfPlayers < 7) {
    		numOfMafia = 1;
    	}
    	
    	if(numOfPlayers >= 7 && numOfPlayers <= 9) {
    		numOfMafia = 2;
    	}
    	if(numOfPlayers >=10 && numOfPlayers <=13) {
    		numOfMafia = 3;
    	}
    	if(numOfPlayers >=14) {
    		numOfMafia = 4;
    	}
    	
    	
    	Collections.shuffle(shuffledList);			//Shuffled copy of playerList to use during role-assigning procedure
    	
        System.out.println("Here are your roles. Please hand the device in the same order you entered names, shown again below");
        Game.print();
        roleList = Role.returnList(numOfPlayers);
        int indexCounter = 0;
        
        for(Player pl : shuffledList) {			//For each player in the playerlist, assign a role to them (through random
        										// shuffling or some other random mechanism that ensures all roles are taken
        	pl.setRole(roleList[indexCounter]);									
        	indexCounter++;
        	}
       
        for(Player pl : playerList) {
        	System.out.println(pl.getName()+", your role is "+ pl.getRole()+". "+ pl.getRole().description()+ "\n");
        	
        	if(!pl.getRole().getIsTown()){
        		for(Player player: playerList) {
        			if (numOfPlayers < 7) {
        				System.out.println("You are the only member of the Mafia!");
        				break;
        			}
        			else if(!player.getRole().getIsTown() && !player.equals(pl)) {
        				System.out.println("Your mafia partner is "+player.getName());
        			}
        			
        			
        		}
        	}
        	
        	
        }
        
       
        /*
         * NIGHT PHASE
         * Searches through the playerList (which will be in the order in which the players entered their names) to decide
         * which night action prompt to run.
         * 
         */
        
        for(Player p : playerList) {
        	
        	
        	if(p.getRole().toString().equals("Doctor")){			
        		Doctor doc = (Doctor) roleList[0];
        		doc.heal();
        	}
        	
        	if(p.getRole().toString().equals("Sheriff")) {
        		Sheriff sher = (Sheriff) roleList[1];
        		sher.Interrogate();
        	}
        	
        	
        	if(p.getRole().toString().equals("Mafia")) {
        		Mafia maf1 = (Mafia) roleList[2];
        		maf1.hit();
        	}
        	
        	if(p.getRole().toString().equals("Villager")) {
        		//Villagers won't get to do much, we could display a pop up for them telling them to act like
        		//they are doing stuff 
        	}
        	
        /*	if(p.getRole().toString().equals("Framer")) {
        		for(Player b: playerList) {
        			if(b.getRole())
        		}
        		
        		Mafia.Framer maf2 =  (Framer) roleList[3];
        		maf2.frame();
        	}
        	
        	*/
        	
        	
        	
        }
        
     }
        
        //continue game logic using other classes.
 
    
    
    
    public static void main(String[] args) {
    	System.out.println("Welcome to Mafia.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of players.");
        numOfPlayers = s.nextInt();
        playerList = new ArrayList<Player>(numOfPlayers);				//Actually creates the playerList A.L
        shuffledList = new ArrayList<Player>(numOfPlayers);				//Initializes the to-be shuffled player A.L
        System.out.println("Enter your usernames.");
        String userName;
        for(int i = 0; i< numOfPlayers; i++) {
        	userName = s.next();
        	Player player = new Player(userName, i);
        	playerList.add(i, player);
        	shuffledList.add(i, player);
        }
        
        
        
       
    	Game g = new Game();
    	//Game.print();
    	//System.out.println();
    	g.play();
    }

}
