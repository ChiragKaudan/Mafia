package mafia;
import java.util.*;

public class Game
{
    int numOfPlayer;
    ArrayList<Player> playerList;
    ArrayList<Role> roleList;


    public void play()
    {

        System.out.println("Welcome to Mafia.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of players.");
        numOfPlayer = s.nextInt();
        System.out.println("Enter your usernames.");
        System.out.println("Here are your roles.");
        //continue game logic using other classes.
    }

}
