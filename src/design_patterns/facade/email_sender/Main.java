package design_patterns.facade.email_sender;

class Main {
    public static void main(String[] args) {
        EmailServiceFacade emailFacade = new EmailServiceFacade();

        emailFacade.sendEmail("ahurein@gmail.com", "Quick Meeting", "Are you there");

        System.out.println("Email Logs:");
        emailFacade.getEmailLogs().forEach(System.out::println);
    }
}