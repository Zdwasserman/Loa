package Wasserman.Zachary.RPGAppTest;

import Wasserman.Zachary.Loa.Attack;
import Wasserman.Zachary.Loa.Fighter;
import Wasserman.Zachary.Loa.Hero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by zacharywasserman on 10/15/16.
 */
public class AttackTest
{
    @Test
    public void damageModFailedRollTest()
    {
        Attack attack = new Attack();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = attack.damageMod(link, 1);
        int expected = -2;
        assertEquals(expected, actual);
    }
    @Test
    public void damageModLowRollTest()
    {
        Attack attack = new Attack();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = attack.damageMod(link, 6);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void damageModMidRollTest()
    {
        Attack attack = new Attack();
        Fighter link = new Hero("link", 10, 10, 10);
        int actual = attack.damageMod(link, 11);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void damageModHighTest()
    {
        Attack attack = new Attack();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = attack.damageMod(link, 16);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void damageModCriticalHitTest()
    {
        Attack attack = new Attack();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = attack.damageMod(link, 20);
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void calcDamageCritTest()
    {
        Attack attack = new Attack();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = attack.calcDamage(link, 5);
        int expected = 15;
        assertEquals(expected, actual);
    }
    @Test
    public void calcDamageFailedRollTest()
    {
        Attack attack = new Attack();
        Fighter link = new Hero("Link", 10, 10, 10);
        int actual = attack.calcDamage(link, -2);
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void dieRoll()
    {
        Attack attack = new Attack();
        int actual = attack.diceRoll();
        assertTrue(actual > 0 && actual <= 20);
    }



}
