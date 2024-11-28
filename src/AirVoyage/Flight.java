package AirVoyage;

import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private String airplaneID;
    private String airplaneName;
    private Date timeDeparture;
    private Date timeArrival;
    private String gate;
    private String departDestination;
    private String arriveDestination;
    private ArrayList<Booking> bookingList = new ArrayList<Booking>();

    public Flight() {
        this("OD0001", "Batik Air",
                new Date(2024, 11, 28, 10, 15, 00),
                new Date(2024, 11, 28, 11, 00, 00));
    }
    public Flight(String airplaneID, String airplaneName, Date timeDeparture, Date timeArrival) {
        this.airplaneID = airplaneID;
        this.airplaneName = airplaneName;
        this.timeDeparture = timeDeparture;
        this.timeArrival = timeArrival;
    }

//    public Flight searchFlight(String origin, String destination, Date departDate) {
//        if(this.origin.equals(origin) && this.destination.equals(destination) && this.departDate.equals(departDate)) {
//            return this;
//        }
//        return null;
//    }


    @Override
    public String toString() {
        return "Flight{" +
                "airplaneID='" + airplaneID + '\'' +
                ", airplaneName='" + airplaneName + '\'' +
                ", timeDeparture=" + timeDeparture +
                ", timeArrival=" + timeArrival +
                ", gate='" + gate + '\'' +
                ", departDestination='" + departDestination + '\'' +
                ", arriveDestination='" + arriveDestination + '\'' +
                ", bookingList=" + bookingList +
                '}';
    }
}
