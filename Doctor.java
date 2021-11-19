package Mafia;

import javax.swing.*;

/**
 * Doctor class, will have the logic for healing a player or themselves. Singleton design pattern used.
 */
public class Doctor extends Role
{
    boolean selfHeal;

    /**
     * Singleton Instantiation of constructor.
     */
    private Doctor()
    {
        this.isTown=true;
        selfHeal=true;
    }
    private static Doctor instance = new Doctor();

    /**
     *
     * @return singleton doctor object
     */
    public static Doctor getInstance()
    {
        return instance;
    }

    /**
     * This method allows the doctor to heal either themselves or someone else that they choose. However, the Doctor can ony heal themselves once.
     * @return the index of the player that is chosen to be healed.
     */
    public int heal()
    {
        if(selfHeal==true)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to self heal?", "Self-Heal???", dialogButton);
            if(dialogResult == 0) {
                selfHeal=false;
                String inputValue = JOptionPane.showInputDialog("Please input your own index (player number).");
                return Integer.valueOf(inputValue);

            } else {
                String inputValue1 = JOptionPane.showInputDialog("Please input the index (number) of player you want to heal.");
                return Integer.valueOf(inputValue1);
            }

        }
        else
        {
            String inputValue2 = JOptionPane.showInputDialog("Please input the index (number) of player you want to heal.");
            return Integer.valueOf(inputValue2);
        }
    }
}
