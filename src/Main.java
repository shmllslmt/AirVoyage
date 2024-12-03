import AirVoyage.Booking;
import AirVoyage.Flight;
import AirVoyage.Passenger;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("AV123", "Air Asia", "JHB", new Date(2024, 07, 31, 10, 00, 00), new Date(2024, 07, 30, 10, 45, 00));
        Flight flight2 = new Flight("AV125", "Air Asia", "JHB", new Date(2024, 07, 29, 10, 00, 00), new Date(2024, 07, 31, 10, 45, 00));
        Flight flight3 = new Flight("OD125", "Batik Air", "JHB", new Date(2024, 07, 31, 10, 00, 00), new Date(2024, 07, 31, 10, 45, 00));
        Flight flight4 = new Flight("OD127", "Batik Air", "JHB", new Date(2024, 07, 29, 10, 00, 00), new Date(2024, 07, 31, 10, 45, 00));
        Flight flight5 = new Flight("MH107", "Malaysia Airlines", "JHB", new Date(2024, 07, 31, 10, 00, 00), new Date(2024, 07, 31, 10, 45, 00));

        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);

        // for-each loop to find flights
        ArrayList<Flight> results = new ArrayList<>();
        for(Flight flight: flights) {
            Flight result = flight.searchFlight("JHB", new Date(2024, 07, 31, 10, 00, 00));

            if(result != null) {
                results.add(result);
            }
        }
        System.out.println("There are "+results.size()+" flight(s) found based on the criteria that you're looking for!");
        System.out.println(results);

//        Flight result = flight1.searchFlight("JHB", "Air Asia", new Date(2024, 07, 30, 10, 00, 00));
//        System.out.println(result);

//        System.out.println(flight1);
//        System.out.println(flight1.calcDuration());

        Booking booking = new Booking();
        booking.setFlight(flight2);

        Passenger passenger = new Passenger();
        booking.setPassenger(passenger);

//        System.out.println(booking);
//        System.out.println(passenger);
    }
}