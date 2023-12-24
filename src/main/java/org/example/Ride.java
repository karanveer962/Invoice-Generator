package org.example;

public class Ride {
    private double distance;
    private int duration;

    public Ride(double distance, int duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }
}
