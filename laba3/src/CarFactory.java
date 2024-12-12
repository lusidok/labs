abstract class CarFactory {
    public abstract Car createCar();
    public void carDescription(String description) {
        Car car = createCar();
        car.giveInfo(description);
    }
}
