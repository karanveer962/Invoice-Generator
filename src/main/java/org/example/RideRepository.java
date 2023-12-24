package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideRepository {
    private final Map<String, List<Ride>> Rides;

    public RideRepository() {
        this.Rides = new HashMap<>();
    }
    public List<Ride> getRidesForUser(String userId) {
        return Rides.getOrDefault(userId, new ArrayList<>());
    }
    public void addRidesForUser(String userId, List<Ride> rides) {
        if(!Rides.containsKey(userId))
            Rides.put(userId,new ArrayList<Ride>());
        Rides.get(userId).addAll(rides);
    }
}
