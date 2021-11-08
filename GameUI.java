import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class GameUI extends JFrame{
	//Creates instance variables
	private static final int HEIGHT = 400;
	private static final int WIDTH = 700;
	private JLabel role, usernameLabel;
	private JButton usernameSelectionButton;
	private JTextField usernameTextBox;
	private String username;
	private UsernameSelectionHandler usernameSelectionHandler;
	private Container pane;
	
	
	public void testViewRun()
	{
		setTitle("Game Screen"); //Sets the title of the window
		role = new JLabel("Role: Town"); //Sample role
		usernameSelectionButton = new JButton("Enter your username: "); 
		usernameTextBox = new JTextField(12);
		usernameSelectionHandler = new UsernameSelectionHandler();
		usernameSelectionButton.addActionListener(usernameSelectionHandler);
		usernameLabel = new JLabel("Username: " + username);
		pane = getContentPane();
		pane.setLayout(new GridLayout(2,1));
		pane.add(usernameSelectionButton);
		pane.add(role);
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
