package Wasserman.Zachary.Loa;

/**
 * Created by zacharywasserman on 10/16/16.
 */
public class Loa {
    public static void main(String[] args) {
        Fighter link = new Hero("Link", 100, 10, 100);
        Fighter ganon = new Monster("Ganon", 100, 10, 10);
        Combat combat = new Combat();
        combat.oraOra(link, ganon);

    }
}
