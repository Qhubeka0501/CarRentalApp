package za.ac.cput.factory;

import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Payment;

import java.time.LocalDate;
import java.time.LocalTime;

/*
 * Class Name: Booking Factory
 * Description: booking  Factory class
 * Author: Alphonsine Ningabiye(230426581)
 * Date: 16 March 2026
 */

public class BookingFactory {
    public static Booking createBooking(String bookingId, String customerId, String carId, LocalDate date, LocalTime startTime, LocalTime endTime, double price,
                                        Payment payment) {

        if (bookingId == null || customerId == null || carId == null) {
            throw new IllegalArgumentException("IDs cannot be null");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        return new Booking.Builder()
                .setBookingId(bookingId)
                .setCustomerId(customerId)
                .setCarId(carId)
                .setDate(date)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .setPrice(price)
                .setPayment(payment)
                .build();
    }
}
