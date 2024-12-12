
public class Main {
    public static void main(String[] args) {
        // Singleton output
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton instance: " + singleton);

        // Factory method output
        CarFactory carFactoryP = new PassengerCarFactory();
        Car passengerCar = carFactoryP.createCar();
        passengerCar.giveInfo("safe");

        CarFactory carFactoryS = new SportCarFactory();
        Car sportCar = carFactoryS.createCar();
        sportCar.giveInfo("fast");

        // Abstract factory output
        Order order1 = new Order(new GoldFactory());
        order1.buy();

        Order order2 = new Order(new SilverFactory());
        order2.buy();

        // Builder output
        ComboBuilder builder = new HappyComboBuilder();
        ComboDirector director = new ComboDirector(builder);

        director.constructCombo();
        Combo combo = builder.getResult();

        System.out.println(combo);

    }
}