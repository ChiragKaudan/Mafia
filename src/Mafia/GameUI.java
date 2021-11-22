package Mafia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class GameUI extends JFrame{
	//Creates instance variables
	private static final int HEIGHT = 400; //Height of the UI
	private static final int WIDTH = 700; //Width of the UI
	private JLabel phase, usernameLabel, round;
	private JButton usernameSelectionButton;
	private JTextField usernameTextBox;
	private String username;
	private UsernameSelectionHandler usernameSelectionHandler;
	private Container pane;
	
	
	public void testViewRun()
	{
		setTitle("Game Screen"); //Sets the title of the window
		phase = new JLabel("Phase: Day"); //Sample phase
		usernameSelectionButton = new JButton("Enter your username: "); 
		round = new JLabel("Round: 1");
		usernameTextBox = new JTextField(12);
		usernameSelectionHandler = new UsernameSelectionHandler();
		usernameSelectionButton.addActionListener(usernameSelectionHandler);
		usernameLabel = new JLabel("Username: " + username);
		pane = getContentPane();
		pane.setLayout(new GridLayout(2,1));
		//Adding panes
		pane.add(usernameSelectionButton);
		pane.add(phase);
		pane.add(round);
		pane.add(usernameTextBox);
		pane.add(usernameLabel);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
	}
	
	private class UsernameSelectionHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			username = usernameTextBox.getText();
			usernameLabel.setText("Username: " + username);
		}
	}
	
	
	
	public static void main (String [] args)
	{
		GameUI test = new GameUI();
		test.testViewRun();
		
	}
	
	

}
