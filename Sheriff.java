package Mafia;

public class Sheriff extends Role
{
    private Sheriff()
    {
        this.isTown=true;
    }

    private static Sheriff instance = new Sheriff();

    public static Sheriff getInstance()
    {
        return instance;
    }

    public boolean Interrogate()
    {
        System.out.println("Test Sheriff object.");
        //insert code to sheriff to interrogate others
        return false;
    }
}
