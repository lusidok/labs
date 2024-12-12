class PassengerCar implements Car {
    @Override
    public void giveInfo(String description) {
        System.out.println("Passenger car is very " + description);
    }
}
