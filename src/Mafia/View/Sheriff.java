package Mafia;

import javax.swing.*;

public class Sheriff extends Role
{
    public Sheriff()
    {
        this.isTown=true;
    }

    public int Interrogate() {
    	int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you suspicious of anyone tonight?", "Interrogate?", dialogButton);
    	if(dialogResult == 0) {
    		String input1 = JOptionPane.showInputDialog("Input the index (number) of the player you wish to interrogate. It is not advisable to interrogate yourself!");
    		return Integer.valueOf(input1);
    	}
    	else {
        	return -1;
        }
    }
}
