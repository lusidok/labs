public class ScheduledCheckingStrategy implements CheckingStrategy {
    @Override
    public void check(String info) {
        System.out.println("You can be calm. You'll be informed about the scheduled check.");
    }
}
