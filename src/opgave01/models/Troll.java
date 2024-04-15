package opgave01.models;

import opgave01.models.weaponBehaviors.AxeBehavior;
import opgave01.models.weaponBehaviors.KnifeBehavior;
import opgave01.models.weaponBehaviors.WeaponBehavior;

public class Troll extends Character {
    public Troll() {
        weapon = new AxeBehavior();
    }
}
