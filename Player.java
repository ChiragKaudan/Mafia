package Mafia;

public class Player
{
    private String username;
    Role role;
    boolean isAlive;

    public Player(String name)
    {
        username=name;

        isAlive=true;
    }
    public void setName(String name)
    {
        username=name;
    }
    public String getName()
    {
        return username;
    }

    public void setRole(Role r)
    {
        role=r;
    }
    public Role getRole()
    {
        return role;
    }
    /**
     * Checks to see if the current player is alive
     * @return boolean whether the player is alive or not
     */
    public boolean checkPlayerAlive()
    {
        return isAlive;
    }
}
