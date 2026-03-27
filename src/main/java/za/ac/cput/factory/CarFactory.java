package za.ac.cput.factory;

import za.ac.cput.domain.Car;


/*
 * Class Name: CarFactory
 * Description: Car Factory class
 * Author: Qhubekani Shandu(231316267)
 * Date: 16 March 2026
 */

public class CarFactory {
    public static Car createCar(String carId, String model, double price, String branchId) {
        return new Car.Builder()
                .carId(carId)
                .model(model)
                .pricePerDay(price)
                .branchId(branchId)
                .build();
    }

}
