package Mafia;

import javax.swing.*;

/**
 * Vigilante class, will have the logic for shooting a player or themselves. Singleton design pattern used.
 */
public class Vigilante extends Role
{
    int bulletsRemaining; /**will be initialized two 2 as that is how many bullets a vigilante can have*/

    /**
     * singleton instantiation
     */
    private Vigilante()
    {
        this.isTown=true;
        bulletsRemaining=2;
    }

    private static Vigilante instance = new Vigilante();

    public static Vigilante getInstance()
    {
        return instance;
    }

    /**
     * Prints out a message to Vigilante warning them that they cant shoot on the first day of the game.
     */
    public void dayOne()
    {
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "You cannot shoot your gun on Day One.",
                "Day One Fam",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Prints out a message to other players that vigilante has shot themselves after killing innocent townsperson.
     */
    public void punishment()
    {
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "The vigilante of this town is distraught and went into depression. Why? Cuz they shot an innocent townsperson. So they decided to shoot themselves. The guilt hit them hard.",
                "BIG NEWS",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Depending on whether the vigilante has bullets left or not, the vigilante shoots who they want to, or may choose to not shoot at all
     * @return index of player to be shot, will be -1 if no one is shot.
     */
    public int shoot()
    {
        if(bulletsRemaining>=1)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to kill someone tonight?", "Kill???", dialogButton);
            if(dialogResult == 0) {
                bulletsRemaining--;
                String inputValue = JOptionPane.showInputDialog("Please input the index (number) of player you want to shoot.");
                return Integer.valueOf(inputValue);

            } else {
                int dialogResult1 = JOptionPane.showConfirmDialog(null,
                        "Ooo you decided to be nice today. Cool, your gun is now put away.",
                        "Gun Put Away",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE);
                return -1;
            }
        }
        else
        {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "You have run out of bullets. Tough luck. You're just an ordinary villager now.",
                    "OOF",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            return -1;
        }
    }
}
