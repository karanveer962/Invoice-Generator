package org.example;


import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {

        InvoiceService invoiceService = new InvoiceService();

        // Add rides for a user
        List<Ride> userRides = new ArrayList<>();
        userRides.add(new Ride(5.0, 10));
        userRides.add(new Ride(3.0, 5));

        invoiceService.addRide("user123", userRides);

        // Get the invoice for the user
        Invoice invoice = invoiceService.getInvoiceForUser("user123");

        // Display the invoice details
        System.out.println("Total Rides: " + invoice.getTotalRides());
        System.out.println("Total Fare: " + invoice.getTotalFare());
        System.out.println("Average Fare Per Ride: " + invoice.getAverageFarePerRide());
    }

 }

