package Mafia;

public class Role
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
