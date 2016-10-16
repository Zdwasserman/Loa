package Wasserman.Zachary.RPGAppTest;

import Wasserman.Zachary.Loa.Combat;
import Wasserman.Zachary.Loa.Fighter;
import Wasserman.Zachary.Loa.Hero;
import Wasserman.Zachary.Loa.Monster;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by zacharywasserman on 10/15/16.
 */
public class CombatTest
{
    @Test
    public void damageModFailedRollTest()
    {
        Combat combat = new Combat();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = combat.damageMod(link, 1);
        int expected = -2;
        assertEquals(expected, actual);
    }
    @Test
    public void damageModLowRollTest()
    {
        Combat combat = new Combat();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = combat.damageMod(link, 6);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void damageModMidRollTest()
    {
        Combat combat = new Combat();
        Fighter link = new Hero("link", 10, 10, 10);
        int actual = combat.damageMod(link, 11);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void damageModHighTest()
    {
        Combat combat = new Combat();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = combat.damageMod(link, 16);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void damageModCriticalHitTest()
    {
        Combat combat = new Combat();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = combat.damageMod(link, 20);
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void calcDamageCritTest()
    {
        Combat combat = new Combat();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = combat.calcDamage(link, 5);
        int expected = 15;
        assertEquals(expected, actual);
    }
    @Test
    public void calcDamageFailedRollTest()
    {
        Combat combat = new Combat();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = combat.calcDamage(link, -2);
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void dieRoll()
    {
        Combat combat = new Combat();
        int actual = combat.diceRoll();
        assertTrue(actual > 0 && actual <= 20);
    }
    @Test
    public void hitRateTest()
    {
        Combat combat = new Combat();
        Fighter link = new Hero("Link", 10, 10, 40);
        Fighter ganon = new Monster("Ganon", 10, 10, 10);
        int actual = combat.hitRate(link, ganon);
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void hitRateTest2()
    {
        Combat combat = new Combat();
        Fighter link = new Hero("Link", 10, 10, 49);
        Fighter ganon = new Monster("Ganon", 10, 10, 10);
        int actual = combat.hitRate(link, ganon);
        int expected = 4;
        assertEquals(expected, actual);
    }



}
