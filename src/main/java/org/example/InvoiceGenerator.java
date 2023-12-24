package org.example;

public class InvoiceGenerator {

    public double calculateFare(double distance, int time) {
        double fare = 0.0;

        // Rs. 10 per kilometer
        fare += 10.0 * distance;

        // Rs. 1 per minute
        fare += 1.0 * time;

        return Math.max(fare,5.0);
    }
}
