package design_patterns.adapter.payment;

public class LegacyPaymentProcessor {
    public void processLegacyPayment(String accountNumber, double amount) {
        System.out.println("Payment processing queued");
    }
}
