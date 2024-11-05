package design_patterns.template.data_validation;

class Main {
    public static void main(String[] args) {
        DataValidator emailValidator = new EmailValidator();
        DataValidator phoneNumberValidator = new PhoneNumberValidator();

        System.out.println("Email Validation:");
        emailValidator.validate("example@example.com");

        System.out.println("\nPhone Number Validation:");
        phoneNumberValidator.validate("+1234567890");
    }
}