package org.example;

public class Ride {
    public enum RideCategory {
        NORMAL,
        PREMIUM
    }

    private double distance;
    private int duration;
    private RideCategory category;

    public Ride(double distance, int duration, RideCategory category) {
        this.distance = distance;
        this.duration = duration;
        this.category=category;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    public RideCategory getCategory() {
        return category;
    }
}
