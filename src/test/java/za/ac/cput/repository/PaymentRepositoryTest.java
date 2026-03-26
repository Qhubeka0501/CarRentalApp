package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.factory.domain.Payment;
import za.ac.cput.factory.repository.PaymentRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PaymentRepositoryTest {

    private PaymentRepository repository;
    private Payment payment;

    @BeforeEach
    void setUp() {
        repository = new PaymentRepository();
        payment = new Payment.Builder()
                .paymentId("P001")
                .amount(6550.0)
                .paymentMethod("Credit Card")
                .paymentDate("2026-03-22")
                .build();
        repository.save(payment);
    }

    @Test
    void savePayment() {
        Payment newPayment = new Payment.Builder()
                .paymentId("P002")
                .amount(7350.0)
                .paymentMethod("Cash")
                .paymentDate("2026-03-24")
                .build();
        repository.save(newPayment);
        assertEquals(2, repository.getAll().size());
    }

    @Test
    void findPaymentById() {
        Payment found = repository.findById("P001");
        assertNotNull(found);
        assertEquals("P001", found.getPaymentId());
    }

    @Test
    void getAllPayments() {
        List<Payment> allPayments = repository.getAll();
        assertEquals(1, allPayments.size());
    }

    @Test
    void deletePayment() {
        repository.delete("P001");
        assertNull(repository.findById("P001"));
        assertEquals(0, repository.getAll().size());
    }
}
