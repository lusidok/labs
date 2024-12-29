public class EmailNotificationAdapter implements NotificationSender {
    private LegacyEmailSender emailSender;
    private String defaultRecipient;

    public EmailNotificationAdapter(LegacyEmailSender emailSender, String defaultRecipient) {
        this.emailSender = emailSender;
        this.defaultRecipient = defaultRecipient;
    }

    @Override
    public void sendNotification(String message) {
        emailSender.sendEmail(defaultRecipient, message);
    }
}