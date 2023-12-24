package org.example;

import java.util.List;

public class InvoiceGenerator {

    public double calculateFare(double distance, int time) {
        double fare = 0.0;

        // Rs. 10 per kilometer
        fare += 10.0 * distance;

        // Rs. 1 per minute
        fare += 1.0 * time;

        return Math.max(fare,5.0);
    }

    public Invoice calculateTotalFare(List<Ride> rides){
        double totalFare = 0.0;

        int totalRides = rides.size();

        for (Ride ride : rides) {
            double rideFare = calculateFare(ride.getDistance(), ride.getDuration());
            totalFare += rideFare;
        }

        double averageFarePerRide = (totalRides > 0) ? totalFare / totalRides : 0.0;

        return new Invoice(totalRides, totalFare, averageFarePerRide);
    }
}
