public class Fort extends Building implements Attacker {
    @Override
    public void attack(Unit unit) {
        if (isBuilt()) {
            unit.receiveDamage(30);
        }
    }
}