package design_patterns.adapter.payment;

public class PaymentProcessorAdapter implements PaymentGateway {
    private final LegacyPaymentProcessor legacyPaymentProcessor;

    public PaymentProcessorAdapter(LegacyPaymentProcessor legacyPaymentProcessor) {
        this.legacyPaymentProcessor = legacyPaymentProcessor;
    }

    @Override
    public void processPayment(String accountNumber, double amount) {
        legacyPaymentProcessor.processLegacyPayment(accountNumber, amount);
    }
}
