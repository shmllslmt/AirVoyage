import AirVoyage.Booking;
import AirVoyage.Flight;
import AirVoyage.Passenger;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("AV123", "Air Asia", new Date(2024, 07, 30, 10, 00, 00), new Date(2024, 07, 30, 10, 45, 00));
        Flight flight2 = new Flight("AV125", "Air Asia", new Date(2024, 07, 31, 10, 00, 00), new Date(2024, 07, 31, 10, 45, 00));

        System.out.println(flight1);

        Booking booking = new Booking();
        booking.setFlight(flight2);

        Passenger passenger = new Passenger();
        booking.setPassenger(passenger);

        System.out.println(booking);
        System.out.println(passenger);
    }
}