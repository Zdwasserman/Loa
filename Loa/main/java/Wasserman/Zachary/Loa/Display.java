package Wasserman.Zachary.Loa;

/**
 * Created by zacharywasserman on 10/16/16.
 */
public class Display {
    public void dealDamage(Fighter fighter, int damage)
    {
        System.out.println(fighter.getName() + " dealt " + damage + " damage.");
    }
    public void criticalHit()
    {
        System.out.println("Critical Hit!");
    }
    public void remainingHealth(Fighter fighter)
    {
        System.out.println(fighter.getName() + " is at " + fighter.getHealth() + " health");
    }
}
