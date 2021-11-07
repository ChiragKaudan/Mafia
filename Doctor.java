package Mafia;

public class Doctor extends Role
{

    private Doctor()
    {
        this.isTown=true;
    }
    private static Doctor instance = new Doctor();

    public static Doctor getInstance()
    {
        return instance;
    }

    public void heal(int nameProtect)
    {
        System.out.println("Test Doctor object.");
    }
}
