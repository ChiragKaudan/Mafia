package Mafia;

/**
 * Villager class made to represent players that are villagers. Only significant thing about them is that they are a part of the town.
 */
public class Villager extends Role
{

    public Villager()
    {
        this.isTown=true;
    }
}
