class PassengerCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new PassengerCar();
    }
}
