public class UnscheduledCheckingStrategy implements CheckingStrategy {
    @Override
    public void check(String info) {
        System.out.println("You need to be careful. No one will inform you about an unscheduled check.");
    }
}
