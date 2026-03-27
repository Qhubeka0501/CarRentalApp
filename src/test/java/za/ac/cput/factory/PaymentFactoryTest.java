package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;


/*
 * Class Name: PaymentFactoryTest
 * Description: Payment Test class
 * Author: Lucky July Twala (231242840)
 * Date: 26 March 2026
 */


class PaymentFactoryTest {

    @Test
    void testCreatePayment() {
        Payment payment = Payment.builder()
                .paymentId("P001")
                .amount(6550.0)
                .paymentMethod("Credit Card")
                .paymentDate("2026-03-22")
                .build();

        assertNotNull(payment);
        assertEquals("P001", payment.getPaymentId());
        assertEquals(6550.0, payment.getAmount());
        assertEquals("Credit Card", payment.getPaymentMethod());
        assertEquals("2026-03-22", payment.getPaymentDate());
    }
}

