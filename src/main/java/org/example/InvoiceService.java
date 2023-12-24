package org.example;
import java.util.List;

public class InvoiceService {
    private final RideRepository rideRepository;
    private final InvoiceGenerator invoiceGenerator;


    public InvoiceService() {
        this.rideRepository = new RideRepository();
        this.invoiceGenerator =new  InvoiceGenerator();
    }

    public Invoice getInvoiceForUser(String userId) {
        List<Ride> rides = rideRepository.getRidesForUser(userId);
        return invoiceGenerator.calculateTotalFare(rides);
    }
    public void addRide(String userId,List<Ride> rides){
        rideRepository.addRidesForUser(userId,rides);
    }
}
