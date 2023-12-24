package org.example;

import java.util.List;

public class InvoiceGenerator {

    public double calculateFare(Ride ride) {
        switch (ride.getCategory()) {
            case NORMAL:
                return calculateNormalRideFare(ride.getDistance(), ride.getDuration());
            case PREMIUM:
                return calculatePremiumRideFare(ride.getDistance(), ride.getDuration());
            default:
                throw new IllegalArgumentException("Invalid ride category");
        }
    }

    public Invoice calculateTotalFare(List<Ride> rides){
        double totalFare = 0.0;

        int totalRides = rides.size();

        for (Ride ride : rides) {
            double rideFare = calculateFare(ride);
            totalFare += rideFare;
        }

        double averageFarePerRide = (totalRides > 0) ? totalFare / totalRides : 0.0;

        return new Invoice(totalRides, totalFare, averageFarePerRide);
    }
    private double calculateNormalRideFare(double distance, int duration) {
        double fare = 10 * distance + 1 * duration;
        return Math.max(fare, 5);
    }
    private double calculatePremiumRideFare(double distance, int duration) {
        double fare = 15 * distance + 2 * duration;
        return Math.max(fare, 20);
    }
}
