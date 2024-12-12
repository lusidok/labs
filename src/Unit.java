public abstract class Unit extends GameObject {
    public boolean Alive;
    public float Hp;
    public float damage;

    public boolean isAlive(){
        if (Hp > 0)
            return Alive;
        else
            return false;
    } //  метод, возвращает, жив ли юнит
    public float getHp(){
        return Hp;
    } //  метод, возвращает количество здоровья у юнита
    public void receiveDamage(float damage) {
        Hp -= damage;
    } //  метод, который вызывается для получения урона этим юнитом
}
