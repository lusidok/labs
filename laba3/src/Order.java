public class Order {
    private Rings rings;
    private Earrings earrings;

    public Order(REFactory factory) {
        rings = factory.createRings();
        earrings = factory.createEarrings();
    }

    public void buy() {
        rings.buy();
        earrings.buy();
    }
}
