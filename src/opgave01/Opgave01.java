package opgave01;

import opgave01.models.Troll;
import opgave01.models.weaponBehaviors.KnifeBehavior;
import opgave01.models.weaponBehaviors.WeaponBehavior;

public class Opgave01 {
    public static void main(String[] args) {
        Troll troll = new Troll();

        troll.fight();

        troll.setWeapon(new KnifeBehavior());

        troll.fight();
    }
}
