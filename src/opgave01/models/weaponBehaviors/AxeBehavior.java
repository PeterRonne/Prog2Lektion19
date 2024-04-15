package opgave01.models.weaponBehaviors;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Swing's a heavy axe");
    }
}
