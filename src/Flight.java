import java.util.Date;

public class Flight {
    private String flightno;
    private String origin;
    private String destination;
    private Date departDate;
    private int availability;
    private int duration;

    Flight() {
        this("OD001", "Johor Bahru", "Singapore", new Date(2024, 11, 7));
    }
    Flight(String flightno, String origin, String destination, Date departDate) {
        this.flightno = flightno;
        this.origin = origin;
        this.destination = destination;
        this.departDate = departDate;
    }

    public Flight searchFlight(String origin, String destination, Date departDate) {
        if(this.origin.equals(origin) && this.destination.equals(destination) && this.departDate.equals(departDate)) {
            return this;
        }
        return null;
    }

    @Override
    public String toString() {
        return  "\nFlight No = " + flightno +
                "\nOrigin = " + origin +
                "\nDestination = " + destination +
                "\nDepart Date = " + departDate +
                "\nAvailability = " + availability +
                "\nDuration = " + duration;
    }
}
