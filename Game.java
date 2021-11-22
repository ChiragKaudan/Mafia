package mafia;
import java.util.*;

public class Game
{
    static int numOfPlayers;
    static ArrayList<Player> playerList;
    
    static ArrayList<Role> roleList;


    public static void print() {
    	for(Player pl : playerList) {
    		System.out.print(pl.getName()+", ");
    	}
    }
    
    
    public void play()
    { 
    	for(Player pl: playerList) {
    		if(pl.getRole()
    	}
    	
    	//this.playerList										//make a copy of playerlist to do the shuffling procedure
        System.out.println("Here are your roles. Please hand the device in the same order you entered names, shown again below");
        Game.print();
        //for(Player pl : randomizedplayerList) {			//For each player in the playerlist, assign a role to them (through random
        										// shuffling or some other random mechanism that ensures all roles are taken
        	
        	//pl.role = roleList[];
        	//System.out.print(pl.getName()+", your role is "+ pl.getRole());				//Show them their role in the original order
        }
        
        //continue game logic using other classes.
 
    
    
    
    public static void main(String[] args) {
    	System.out.println("Welcome to Mafia.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of players.");
        numOfPlayers = s.nextInt();
       playerList = new ArrayList<Player>(numOfPlayers);				//Actually creates the playerList A.L
       
        System.out.println("Enter your usernames.");
        String userName;
        for(int i = 0; i< numOfPlayers; i++) {
        	userName = s.next();
        	Player player = new Player(userName, i);
        	playerList.add(i, player);
        }
        
       
    	Game g = new Game();
    //	g.print();
    }

}
