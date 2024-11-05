package design_patterns.facade.email_sender;

import java.util.List;

class EmailServiceFacade {
    private final EmailComposer composer = new EmailComposer();
    private final EmailSender sender = new EmailSender();
    private final EmailLogger logger = new EmailLogger();

    public void sendEmail(String recipient, String subject, String body) {
        String emailContent = composer.composeEmail(recipient, subject, body);
        sender.sendEmail(emailContent);
        logger.logEmail(emailContent);
    }

    public List<String> getEmailLogs() {
        return logger.getEmailLogs();
    }
}