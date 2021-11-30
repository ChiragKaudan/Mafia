package Mafia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.concurrent.*;


public class GameUI extends JFrame{
	BlockingQueue<Message> queue;
	
	//Creating static instance variables
	private static final int HEIGHT = 800; //Height of the UI
	private static final int WIDTH = 400; //Width of the UI
	
	//Creates instance variables
	private int buttonCounter = 0;
	private int roundCounter = 0;
	private int phaseCounter = 0;
	
	private JLabel phase, usernameLabel, roundLabel;
	private UpdateHandler updateHandler;
	private JButton updateButton;
	private Container pane;

	
	private ArrayList<Player> playerList;
	
	public GameUI(BlockingQueue<Message> queue, ArrayList<Player> inputPlayers)
	{
		this.queue = queue;
		setTitle("Mafia Game"); //Sets the title of the window
		phase = new JLabel("Phase: Day"); //Sample phase
		roundLabel = new JLabel("Round: " + roundCounter); //Sample round
		usernameLabel = new JLabel(generateNames());
		updateHandler = new UpdateHandler();
		updateButton = new JButton("Update Round");
		
		
		updateButton.addActionListener (e -> {
			buttonCounter += 1;
			if(buttonCounter % 2 == 1)
			{
				roundCounter += 1;
				phase.setText("Phase: Day");
				phaseCounter = 0;
				
			}
			else
			{
				phase.setText("Phase: Night");
				phaseCounter = 1;
			}
			roundLabel.setText("Round: " + roundCounter);
			
            try {
                Message roundPhaseMessage = new UpdateRoundMessage(phaseCounter, roundCounter);
                queue.put(roundPhaseMessage);
                
       
            } catch (InterruptedException exception) {
                // do nothing
            }
			
		});}
	/**
	 * Running of the View
	 */
	public void ViewRun()
	{
		
		pane = getContentPane();
		pane.setLayout(new GridLayout(2,1));
		//Adding panes
		pane.add(usernameLabel);
		pane.add(phase);
		pane.add(roundLabel);
		pane.add(updateButton);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
	}
	
	/**
	 * Handles the updating of rounds + day/night cycles for easy visibility
	 * 
	 */
	private class UpdateHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			buttonCounter += 1;
			if(buttonCounter % 2 == 1)
			{
				roundCounter += 1;
				phase.setText("Phase: Day");
				phaseCounter = 1;
			}
			else
			{
				phase.setText("Phase: Night");
				phaseCounter = 0;
			}
			roundLabel.setText("Round: " + roundCounter);
			
		}
	}
	
	/**
	 * Generates an arraylist of String that represents the names of the players and returns a string representation of it
	 * @return
	 */
	private String generateNames()
	{
		String s;
		s = "List of Players: ";
		int index = 0;
		
		for (Player player: playerList)
		{
			s += index + " " + player.getName() + " ";
			index++;
		}
		return s;
	}
	
	
	
	
	public static void main (String [] args)
	{
		/**
		ArrayList<Player> testArrayList = new ArrayList<Player>();
		Player bob = new Player("Bob");
		Player john = new Player("John");
		testArrayList.add(bob);
		testArrayList.add(john);
		GameUI test = new GameUI(testArrayList);
		test.ViewRun();
		*/
		
	}
	
	

}
