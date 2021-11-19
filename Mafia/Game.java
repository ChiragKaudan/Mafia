package Mafia;
import java.util.*;

public class Game
{

    int numOfPlayer;
    ArrayList<Player> playerList;
    ArrayList<Role> roleList;
    public static void main(String [] args) {
        System.out.println("Testing Doctor, Sheriff, and Vigilante for design pattern.");
        Doctor doctor=Doctor.getInstance();
        Sheriff sheriff=Sheriff.getInstance();
        Vigilante vigilante=Vigilante.getInstance();
        doctor.heal(1);
        sheriff.Interrogate();
        vigilante.shoot(1);


    }

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
