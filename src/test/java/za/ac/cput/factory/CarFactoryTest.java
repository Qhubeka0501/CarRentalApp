package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    /*
     * Class Name: CarFactoryTest
     * Description: Car Test class
     * Author: Qhubekani Shandu(231316267)
     * Date: 26 March 2026
     */

    @Test
    void createCar() {
        Car car = CarFactory.createCar("CA MDALI", "Toyota Corolla", 6550.0, "24D89");

        assertNotNull(car);
        assertEquals("CA MDALI", car.getCarId());
        assertEquals("Toyota Corolla", car.getModel());
        assertEquals(6550.0, car.getPricePerDay());
        assertEquals("24D89", car.getBranchId());
    }

}