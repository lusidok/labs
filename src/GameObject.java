public abstract class GameObject {
    // главный класс, от которого пойдет наследование
    public int Id;
    public String Name;
    public int X;
    public int Y;

    public int getId(){
        return Id;
    } //  метод, возвращает идентификатор объекта
    public String getName(){
        return Name;
    } //  метод, возвращает имя объекта
    public int getX(){
        return X;
    } //  метод, где находится объект по X координате
    public int getY(){
        return Y;
    } //  метод, где находится объект по Y координате
    public void setX(int x) {
        X = x;
    };

    public void setY(int y) {
        Y = y;
    };
}