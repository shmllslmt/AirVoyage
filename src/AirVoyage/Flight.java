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
        this("OD0001", "Batik Air", "JHB",
                new Date(2024, 11, 28, 10, 15, 00),
                new Date(2024, 11, 28, 11, 00, 00));
    }
    public Flight(String airplaneID, String airplaneName, String departDestination, Date timeDeparture, Date timeArrival) {
        this.airplaneID = airplaneID;
        this.airplaneName = airplaneName;
        this.timeDeparture = timeDeparture;
        this.timeArrival = timeArrival;
        this.departDestination = departDestination;
    }

    public int calcDuration() {
        // To find differences between two date objects

        long duration = (timeArrival.getTime() - timeDeparture.getTime()) / 1000 / 60;

        // type cast to int data type
        return (int)duration;
    }

    public Flight searchFlight(String origin, Date departure) {
        if(this.departDestination.equals(origin) && this.timeDeparture.equals(departure)) {
//            System.out.println("Flight found!");
            return this;
        } else {
//            System.out.println("Flight not found!");
            return null;
        }
    }


    @Override
    public String toString() {
        return "Flight{" +
                "airplaneID='" + airplaneID + '\n' +
                ", airplaneName='" + airplaneName + '\n' +
                ", timeDeparture=" + timeDeparture +
                ", timeArrival=" + timeArrival +
//                ", gate='" + gate + '\'' +
                ", departDestination='" + departDestination + '\n' +
//                ", arriveDestination='" + arriveDestination + '\'' +
//                ", bookingList=" + bookingList +
                '}';
    }
}
