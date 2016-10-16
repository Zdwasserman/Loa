package Wasserman.Zachary.Loa;

/**
 * Created by zacharywasserman on 10/16/16.
 */
public class Loa {
    public static void main(String[] args) {
        Fighter link = new Hero("Link", 20, 5, 10);
        Fighter ganon = new Monster("Ganon", 20, 10, 10);
        Attack attack = new Attack();
        attack.fight(link, ganon);

    }
}
