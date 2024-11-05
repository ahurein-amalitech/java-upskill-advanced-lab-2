package design_patterns.adapter.payment;

public class Main {
    public static void main(String[] args) {
        LegacyPaymentProcessor legacyProcessor = new LegacyPaymentProcessor();
        PaymentGateway paymentGateway = new PaymentProcessorAdapter(legacyProcessor);

        paymentGateway.processPayment("123-456-789", 250.00);
    }
}
