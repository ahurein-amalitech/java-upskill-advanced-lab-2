package design_patterns.facade.email_sender;

class EmailComposer {
    public String composeEmail(String recipient, String subject, String body) {
        System.out.println("Composing email to " + recipient);
        return "To: " + recipient + "\nSubject: " + subject + "\n\n" + body;
    }
}