package Wasserman.Zachary.Loa;

import java.util.Random;

/**
 * Created by zacharywasserman on 10/15/16.
 */
public class Combat {
    Random random = new Random();
    Display display = new Display();

    public int calcDamage(Fighter fighter, int mod) {
        int damage = fighter.getStength() + mod;
        return damage;
    }

    public int damageMod(Fighter fighter, int dieRoll) {
        int mod;
        if (dieRoll > 0 && dieRoll <= 5) {
            return mod = -2;
        }
        if (dieRoll > 5 && dieRoll <= 10) {
            return mod = 0;
        }
        if (dieRoll > 10 && dieRoll <= 15) {
            return mod = 2;
        }
        if (dieRoll > 15 && dieRoll <= 19) {
            return mod = 3;
        }
        if (dieRoll == 20) {
            display.criticalHit();
            return mod = (int) ((fighter.getStength() * 2.5) - fighter.getStength());
        }
        return 9999;
    }

    public int diceRoll() {
        int dieRoll = random.nextInt(20) + 1;
        return dieRoll;
    }

    public void dealDamage(Fighter defender, int damage) {
        defender.setHealth(defender.getHealth() - damage);
    }
    public int hitRate(Fighter fighter, Fighter defender)
    {
        int numOfHits = Math.round(fighter.getSpeed() / defender.getSpeed());
        return numOfHits;
    }

    public void fight(Fighter fighter, Fighter defender) {
        int dieroll = diceRoll();
        int dmgMod = damageMod(fighter, dieroll);
        int damage = calcDamage(fighter, dmgMod);
        dealDamage(defender, damage);
        display.dealDamage(fighter, damage);
    }
    public void oraOra(Fighter fighter, Fighter defender)
    {
        int numOfHits = hitRate(fighter, defender);
        for(int i = 0; i < numOfHits; i++)
        {
            fight(fighter, defender);
        }
        display.remainingHealth(defender);
    }


}
