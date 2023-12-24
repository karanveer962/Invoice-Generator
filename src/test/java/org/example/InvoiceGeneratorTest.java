package org.example;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvoiceGeneratorTest {
    private InvoiceService invoiceService;

    @Before    // Create a single instance of InvoiceGenerator to be reused in each test
    public void setUp() {
        invoiceService = new InvoiceService();
    }

    @Test
    public void calculateInvoice_ShouldReturnZeroValues_WhenNoRidesProvided() {

        List<Ride> rides = Arrays.asList();

        invoiceService.addRide("123",rides);
        Invoice invoice =invoiceService.getInvoiceForUser("123");


        assertEquals(0, invoice.getTotalRides());
        assertEquals(0.0, invoice.getTotalFare(), 0.0);
        assertEquals(0.0, invoice.getAverageFarePerRide(), 0.0);
    }

    @Test
    public void calculateInvoice_ShouldReturnCorrectValues_WhenRidesProvided() {
        List<Ride> rides = Arrays.asList(
                new Ride(5.0, 10),  // Rs. 60
                new Ride(3.0, 5)    // Rs. 35
        );


        invoiceService.addRide("123",rides);
        Invoice invoice =invoiceService.getInvoiceForUser("123");


        assertEquals(2, invoice.getTotalRides());
        assertEquals(95.0, invoice.getTotalFare(), 0.0);
        assertEquals(47.5, invoice.getAverageFarePerRide(), 0.0);
    }

}
