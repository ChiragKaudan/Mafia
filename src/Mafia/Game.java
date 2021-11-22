package Mafia;
import javax.swing.*;
import java.util.*;

public class Game
{

    int numOfPlayer;
    ArrayList<Player> playerList;
    ArrayList<Role> roleList;
    
    public static void main(String [] args) {
        System.out.println("Testing Doctor, Sheriff, and Vigilante for design pattern.");
        Vigilante vigilante=Vigilante.getInstance();
        vigilante.dayOne();
        vigilante.punishment();
        vigilante.shoot();
        Doctor doctor=Doctor.getInstance();
        doctor.heal();

        Sheriff sheriff = new Sheriff();
        sheriff.Interrogate();
        
        Mafia mafia = new Mafia();
        mafia.hit();
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
