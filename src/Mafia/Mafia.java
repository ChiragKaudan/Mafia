package Mafia;

import javax.swing.*;

public class Mafia extends Role
{
    public Mafia()
    {
        this.isTown=false;
    }

    public int hit() {
    	int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to call a hit on someone?", "Call A Hit?",dialogButton);
    	if(dialogResult == 0) {
    		String input1 = JOptionPane.showInputDialog("Input the index (number) of the player you want to kill");
    		return Integer.valueOf(input1);
    	}
    	else {
        	return -1;
        }
    }
}
