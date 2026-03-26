package za.ac.cput.factory.factory;

import za.ac.cput.factory.domain.Payment;
import za.ac.cput.factory.domain.RentalAgent;

public class PaymentFactory {
    public static Payment createPayment(String paymentId, double amount, String paymentMethod, String paymentDate) {
        // Optional: add validation here
        if(paymentId == null || paymentId.isEmpty()) {
            throw new IllegalArgumentException("Payment ID is required");
        }
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if(paymentMethod == null || paymentMethod.isEmpty()) {
            throw new IllegalArgumentException("Payment method is required");
        }
        return Payment.builder()
                .paymentId(paymentId)
                .amount(amount)
                .paymentMethod(paymentMethod)
                .paymentDate(paymentDate)
                .build();
    }
}
