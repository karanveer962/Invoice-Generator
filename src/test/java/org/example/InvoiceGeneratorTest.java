package org.example;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InvoiceGeneratorTest {
    private InvoiceGenerator invoiceGenerator;

    @Before    // Create a single instance of InvoiceGenerator to be reused in each test
    public void setUp() {
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void calculateTotalFare_ShouldReturnZero_WhenNoRides() {

        List<Ride> rides = new ArrayList<>();


        double totalFare = invoiceGenerator.calculateTotalFare(rides);


        assertEquals(0.0, totalFare, 0.0);
    }

    @Test
    public void calculateTotalFare_ShouldReturnCorrectFare_WhenSingleRide() {

        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(5.0, 10));  // Single ride: 5 kilometers, 10 minutes


        double totalFare = invoiceGenerator.calculateTotalFare(rides);


        assertEquals(60.0, totalFare, 0.0);
    }

    @Test
    public void calculateTotalFare_ShouldReturnCorrectFare_WhenMultipleRides() {

        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(5.0, 10));  // Ride 1: 5 kilometers, 10 minutes
        rides.add(new Ride(3.0, 8));   // Ride 2: 3 kilometers, 8 minutes


        double totalFare = invoiceGenerator.calculateTotalFare(rides);


        assertEquals( 98.0 ,totalFare, 0.0);
    }

}
