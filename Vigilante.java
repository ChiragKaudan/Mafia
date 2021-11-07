package Mafia;

public class Vigilante extends Role
{
    private Vigilante()
    {
        this.isTown=true;
    }
    private static Vigilante instance = new Vigilante();

    public static Vigilante getInstance()
    {
        return instance;
    }

    public void shoot(int nameIndex)
    {
        System.out.println("Test Vigilante object.");
        //remove the person from the arrayList that the vigilante wants to shoot
        //first check if person is healed and check who exactly wants to be shot

    }
}
