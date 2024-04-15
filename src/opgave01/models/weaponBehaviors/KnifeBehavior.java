package opgave01.models.weaponBehaviors;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Stab's with a knife");
    }
}
