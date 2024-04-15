package opgave01.models;

import opgave01.models.weaponBehaviors.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }


    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
