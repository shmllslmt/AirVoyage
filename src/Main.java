import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("AV123", "Kuala Lumpur", "Singapore", new Date(2024, 07, 30));
        Flight flight2 = new Flight("AK567", "Bangkok", "Phuket", new Date(2024, 07, 30));
        Flight flight3 = new Flight("VN890", "Ho Chi Minh City", "Da Nang", new Date(2024, 07, 30));
        Flight flight4 = new Flight("MH1234", "Kuala Lumpur", "Tokyo", new Date(2024, 07, 30));
        Flight flight5 = new Flight("SQ345", "Singapore", "Bali", new Date(2024, 07, 30));

        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(new Flight("SQ346", "Singapore", "Bali", new Date(2024, 07, 30)));
        flights.add(new Flight("SQ347", "Singapore", "Bali", new Date(2024, 07, 30)));
        flights.add(new Flight("SQ348", "Singapore", "Bali", new Date(2024, 07, 30)));

        ArrayList<Flight> results = new ArrayList<>();
        for(Flight f: flights) {
            Flight temp = f.searchFlight("Singapore", "Bali", new Date(2024, 07, 30));

            if(temp != null)
                results.add(temp);
        }

        System.out.println(results);
    }
}