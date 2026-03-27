package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import za.ac.cput.domain.RentalAgent;

/*
 * Class Name: PaymentFactory
 * Description: Payment Factory class
 * Author: Lucky July Twala (231242840)
 * Date:   16 March 2026
 */

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

