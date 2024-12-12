class SportCar implements Car {
    @Override
    public void giveInfo(String description) {
        System.out.println("Sport car is very " + description);
    }
}