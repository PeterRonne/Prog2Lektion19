package opgave01.models.weaponBehaviors;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("shoots and arrow");
    }
}
