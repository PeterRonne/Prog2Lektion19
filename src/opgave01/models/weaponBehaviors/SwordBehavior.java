package opgave01.models.weaponBehaviors;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Swings a sword");
    }
}
