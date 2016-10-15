package Wasserman.Zachary.Loa;

import java.util.Random;

/**
 * Created by zacharywasserman on 10/15/16.
 */
public class Attack {
    Random random = new Random();
    public int calcDamage(Fighter fighter, int mod)
    {
        int damage = fighter.getStength() + mod;
        return damage;
    }
    public int damageMod(Fighter fighter, int dieRoll)
    {
        int mod;
        if(dieRoll > 0 && dieRoll <= 5)
        {
            return mod = -2;
        }
        if(dieRoll > 5 && dieRoll <= 10)
        {
            return mod = 0;
        }
        if(dieRoll > 10 && dieRoll <= 15)
        {
            return mod = 2;
        }
        if(dieRoll > 15 && dieRoll <= 19)
        {
            return mod = 3;
        }
        if(dieRoll == 20)
        {
            return mod = (int)((fighter.getStength() * 1.5)-fighter.getStength());
        }
        return 9999;
    }
    public int diceRoll()
    {
        int dieRoll = random.nextInt(20)+1;
        return dieRoll;
    }

}
