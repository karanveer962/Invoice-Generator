package org.example;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class InvoiceGeneratorTest {
    private InvoiceGenerator invoiceGenerator;

    @Before    // Create a single instance of InvoiceGenerator to be reused in each test
    public void setUp() {
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void calculateFare_ShouldReturnMinimumFare_WhenDistanceAndTimeAreZero() {

        double distance = 0.0;
        int time = 0;


        double fare = invoiceGenerator.calculateFare(distance, time);


        assertEquals(5.0, fare,0.0);
    }

    @Test
    public void calculateFare_ShouldReturnCorrectFare_WhenDistanceAndTimeAreNonZero() {

        double distance = 5.0;
        int time = 10;


        double fare = invoiceGenerator.calculateFare(distance, time);

        //  Rs. 10 per km * 5 + Rs. 1 per min * 10 = Rs. 50 + Rs. 10 = Rs. 60
        assertEquals(60.0, fare ,0.0);
    }

}
