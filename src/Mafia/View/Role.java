package Mafia;

import javax.swing.*;

public class Role extends JComponent
{
    private int voteCounter;
    protected boolean isTown;

    public Role()
    {
        voteCounter=0;
        isTown=true;
    }

    public void vote()
    {
        voteCounter++;
    }

    public void setIsTown(boolean x)
    {
        isTown=x;
    }
    public boolean getIsTown()
    {
        return isTown;
    }

    public void description()
    {
        System.out.println("Insert Proper Role Description");
    }
}
