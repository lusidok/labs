public class Archer extends Unit implements Attacker, Moveable {
    @Override
    public void attack(Unit unit) {
        if(isAlive()) {
            unit.receiveDamage(10);
        }
    }

    @Override
    public void move(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
    }
}
