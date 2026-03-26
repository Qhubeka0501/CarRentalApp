package za.ac.cput.factory.repository;

import za.ac.cput.factory.domain.Payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class PaymentRepository {
    // Simulate data persistence
    private Map<String, Payment> paymentMap = new HashMap<>();

    // Save a new Payment
    public Payment save(Payment payment) {
        paymentMap.put(payment.getPaymentId(), payment);
        return payment;
    }

    // Find a Payment by ID
    public Payment findById(String paymentId) {

        return paymentMap.get(paymentId);
    }

    // Get all Payments
    public List<Payment> getAll() {

        return new ArrayList<>(paymentMap.values());
    }

    // Delete a Payment by ID
    public boolean delete(String paymentId) {

        return paymentMap.remove(paymentId) != null;
    }

}
