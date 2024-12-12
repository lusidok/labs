class SportCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new SportCar();
    }
}
