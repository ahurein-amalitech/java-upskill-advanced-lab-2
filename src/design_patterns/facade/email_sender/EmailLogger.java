package design_patterns.facade.email_sender;

import java.util.ArrayList;
import java.util.List;

class EmailLogger {
    private final List<String> emailLogs = new ArrayList<>();

    public void logEmail(String emailContent) {
        emailLogs.add(emailContent);
        System.out.println("[Logs] Sending email to " + emailContent);
    }

    public List<String> getEmailLogs() {
        return emailLogs;
    }
}