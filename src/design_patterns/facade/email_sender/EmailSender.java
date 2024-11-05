package design_patterns.facade.email_sender;

class EmailSender {
    public void sendEmail(String emailContent) {
        System.out.println("Sending email:\n" + emailContent);
    }
}