package Wasserman.Zachary.Loa;

/**
 * Created by zacharywasserman on 10/15/16.
 */
public class Fighter
{
     private String name;
     private int health;
     private int strength;
     private int speed;

    public Fighter(String name, int health, int strength, int speed)
    {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.speed = speed;

    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getStength() {
        return strength;
    }
    public int getSpeed() {
        return speed;
    }

    private void doDamage() {}
    private void takeDamage(){}


}
