package za.ac.cput.factory;

import za.ac.cput.domain.Customer;


/*
 * Class Name: CustomerFactory
 * Description: Customer Factory class
 * Author: Avuyile Twesha (2040763394)
 * Date: 16 March 2026
 */


public class CustomerFactory {

        public static Customer createCustomer(String customerId, String name, String address,String driverLicenseNumber) {

            return new Customer.Builder()
                    .setCustomerId(customerId)
                    .setName(name)
                    .setAddress(address)
                    .setDriverLicenseNumber(driverLicenseNumber)
                    .build();
        }
    }










