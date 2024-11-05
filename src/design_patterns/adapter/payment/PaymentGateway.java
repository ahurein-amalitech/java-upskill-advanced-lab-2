package design_patterns.adapter.payment;

public interface PaymentGateway {
    void processPayment(String accountNumber, double amount);
}
